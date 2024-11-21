import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("stop")){
            String s1=input.toUpperCase();
            String s2=input.toLowerCase();
            String s3=s1.concat(s2);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            input = scanner.nextLine();
        }
        System.out.println("程序结束");
    }
}

