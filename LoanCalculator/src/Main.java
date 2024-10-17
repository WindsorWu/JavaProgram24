public class Main {
    public static void main(String[] args) {
        int a = 100;
        int m = 360;
        double y = 0.049;
        LoanCalculator loanCalculator = new LoanCalculator(a, m, y);
        loanCalculator.avgInterest();
        loanCalculator.avgCaption();
        loanCalculator.print();
    }
}
