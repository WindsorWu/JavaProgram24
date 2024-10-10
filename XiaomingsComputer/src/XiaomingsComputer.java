import java.util.*;

public class XiaomingsComputer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入电脑的价格: ");
        int price = scanner.nextInt();
        if (price > 100000) {
        System.out.println("太贵了！买不起！");
        System.exit(0);
        }
        int day = 0;
        int totalMoney = 0;
        while (totalMoney < price) {
            day++;
            totalMoney += day;
        }

        System.out.println("小明在第 " + day + " 天可以攒够钱买电脑。");
    }
}
