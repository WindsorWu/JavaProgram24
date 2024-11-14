import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Random;

public class Games2048 extends JPanel {
    private static final int SIZE = 4;
    private static final int SQUARE_A = 100;
    private int[][] grid = new int[SIZE][SIZE];
    private final Random random = new Random();

    private boolean win = false;

    private boolean lose = false;

    Games2048(){
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(!win && !lose){
                    switch (e.getKeyCode()){
                        case KeyEvent.VK_UP, KeyEvent.VK_W -> moveUP();
                        case KeyEvent.VK_DOWN, KeyEvent.VK_S -> moveDown();
                        case KeyEvent.VK_LEFT, KeyEvent.VK_A -> moveLeft();
                        case KeyEvent.VK_RIGHT, KeyEvent.VK_D -> moveRight();
                    }
                    repaint();
                    spawnTile();
                    checkGameState();
                }

            }
        });
        spawnTile();
        spawnTile();
    }

    private void moveLeft(){
        for(int row=0; row<SIZE; row++){
            int[] mergedRow = new int[SIZE];
            Arrays.fill(mergedRow,0);
            boolean[] alreadyMerged = new boolean[SIZE];
            Arrays.fill(alreadyMerged,false);
            int colIndex = 0;
            for(int col=0; col<SIZE; col++){
                if (grid[row][col] != 0){
                    if(colIndex == 0){
                        mergedRow[colIndex] = grid[row][col];
                        colIndex++;
                    }
                    else {
                        if(grid[row][col] == mergedRow[colIndex-1]&& !alreadyMerged[colIndex-1]){
                            mergedRow[colIndex-1] *= 2;
                            alreadyMerged[colIndex] = true;
                        }
                        else {
                            mergedRow[colIndex] = grid[row][col];
                            colIndex++;
                        }
                    }
                }
            }
            System.arraycopy(mergedRow, 0, grid[row], 0, SIZE);
        }
    }

    private void moveRight(){
        rotateRight();
        rotateRight();
        moveLeft();
        rotateRight();
        rotateRight();
    }

    private void moveUP(){
        rotateRight();
        rotateRight();
        rotateRight();
        moveLeft();
        rotateRight();
    }

    private void moveDown(){
        rotateRight();
        moveLeft();
        rotateRight();
        rotateRight();
        rotateRight();
    }

    private void rotateRight(){
        int[][] newGrid = new int[SIZE][SIZE];
        for(int row=0; row<SIZE; row++){
            for(int col=0; col<SIZE; col++){
                newGrid[col][SIZE-1-row] = grid[row][col];
            }
        }
        grid = newGrid;
    }

    private void checkGameState(){
        int cnt=0;
        for(int row=0; row<SIZE; row++){
            for(int col=0; col<SIZE; col++){
                if(grid[row][col] == 2048){
                    win = true;
                    break;
                }
                else{
                    if(grid[row][col] != 0){
                        cnt++;
                    }
                }
            }
            if(win){
                break;
            }
        }
        if(!win){
            if(cnt < SIZE*SIZE){
                return;
            }
            for(int row=0; row<SIZE; row++){
                for(int col=0; col<SIZE; col++){
                    if(row<SIZE-1 && grid[row][col] == grid[row+1][col]){
                        return;
                    }
                    if(col<SIZE-1 && grid[row][col] == grid[row][col+1]){
                        return;
                    }
                }
            }
            lose = true;
        }
    }
    private void spawnTile() {
        int cnt=0;
        for(int row=0; row<SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (grid[row][col] != 0) {
                    cnt++;
                }
            }
        }
        if(cnt == SIZE * SIZE){
            return;
        }
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (grid[x][y] != 0);
        grid[x][y] = random.nextInt(10) < 5 ? 2 : 4;

    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, getWidth(),getHeight());
        for(int row = 0;row<4;row++){
            for(int col = 0;col<4;col++){
                drawTile(g,grid[row][col], col*SQUARE_A, row*SQUARE_A);
            }
        }
        g.setColor(Color.BLACK);
        if(win){
            g.drawString("You Win!", getWidth()/2, getHeight()/2);
        }
        if(lose){
            g.drawString("Game Over!", getWidth()/2, getHeight()/2);
        }
    }


    private void drawTile(Graphics g,int value,int x,int y) {
        int m=(int) (Math.log(value) / Math.log(2));
        g.setColor(value == 0 ? Color.GRAY : new Color(255-m*20, 240, 200));
        g.fillRect(x, y, SQUARE_A, SQUARE_A);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, SQUARE_A, SQUARE_A);

        if(value!=0) {
            FontMetrics fontMetrics = g.getFontMetrics();
            int textX = x + (SQUARE_A - fontMetrics.stringWidth(String.valueOf(value))) / 2;
            int textY = y + (SQUARE_A - fontMetrics.getHeight()) / 2+fontMetrics.getAscent();
            g.drawString(String.valueOf(value), textX, textY);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("2048 Games");
        Games2048 games2048 = new Games2048();
        frame.setSize(420, 460);
        frame.add(games2048);
        frame.setVisible(true);
    }
}