import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final String EMAIL_REGEX="^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+$";
    public static boolean isValidEmail(String email){
        if(email == null){
            return false;
        }
        Pattern pattern =Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(isValidEmail(s)){
            System.out.println("这是合法的邮箱");
        }
        else{
            System.out.println("这不是合法的邮箱");
        }
    }
}