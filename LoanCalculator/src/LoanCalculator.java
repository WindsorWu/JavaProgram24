public class LoanCalculator {
    int a;
    int m;
    double y;
    double avgInt;
    double avgCap;
    LoanCalculator(int a, int m, double y){
        this.a=a;
        this.m=m;
        this.y=y;
    }
    void avgInterest() {
        avgCap = ((m + 1) * a * (y / 12) / 2);
    }
    void avgCaption() {
        avgInt = (m * a * (y / 12) * Math.pow(1 + (y / 12), m)) / (Math.pow(1 + (y / 12), m) - 1) - a;
    }
    void print(){
        System.out.println("本金："+avgCap+"万元");
        System.out.println("本息："+avgInt+"万元");
    }
}


