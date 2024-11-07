import javax.swing.*;
import java.awt.*;
import java.util.Random;

// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Games2048 extends JPanel {
    private static final int SIZE=4;
    private static final int SQUARE_A=100;
    private final int[][] grid=new int[SIZE][SIZE];
    private final Random random = new Random();

    Games2048(){
        spawnTile();
        spawnTile();
    }
    private void spawnTile() {
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
        g.fillRect(0,0,getWidth(),getHeight());
        for(int row=0;row<4;row++){
            for(int col=0;col<4;col++){
                drawTile(g,grid[row][col],col*SQUARE_A,row*SQUARE_A);
                //g.setColor(Color.black);
                //g.drawRect(row*10,col*10,100,120);
            }
        }

    }

    private void drawTile(Graphics g,int value,int x,int y) {
        int m=(int) (Math.log(value)/Math.log(2));
        g.setColor(value==0?Color.GRAY:new Color(255-m*20,240,200));
        g.fillRect(x,y,SQUARE_A,SQUARE_A);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,SQUARE_A,SQUARE_A);

        if(value!=0) {
            FontMetrics fontMetrics=g.getFontMetrics();
            int textX=x+(SQUARE_A-fontMetrics.stringWidth(String.valueOf(value)))/2;
            int textY=y+(SQUARE_A-fontMetrics.getHeight())/2+fontMetrics.getAscent();
            g.drawString(String.valueOf(value),textX,textY);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("2048 Games");
        Games2048 games2048 = new Games2048();
        frame.setSize(420,460);
        frame.add(games2048);
        frame.setVisible(true);
    }
}