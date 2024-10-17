public class EquationSolving1_2 {
    int a;
    int b;
    int c;

    double x1;
    double x2;

    boolean solve() {
        boolean ret = false;
        if (a == 0) {
            System.out.println("这不是一元二次方程。");
        } else {
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("此方程无解。");
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                ret = true;
            }
        }
        return ret;
    }

    void print() {
        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);
    }

    void input(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
