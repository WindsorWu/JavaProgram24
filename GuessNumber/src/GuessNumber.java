import java.util.Scanner;

public class GuessNumber {
    public static void main(String args[]){
        System.out.println("请输入一个1-10000数字：");
        Scanner reader = new Scanner(System.in);
        int answer = reader.nextInt();
        boolean sussOrFail = true;
        for(int i=0;i<14;i++){
            System.out.print("这是第"+i+"次机会，请输入");
            int guessNumber = reader.nextInt();
            if(guessNumber > answer){
                System.out.println("太大了。");
            }
            else if(guessNumber < answer){
                System.out.println("太小了。");
            }
            else{
                System.out.println("猜对了。");
                sussOrFail = true;
                break;
            }
        }
        if(!sussOrFail){
            System.out.println("失败了。");
        }
    }
}