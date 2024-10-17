public class Main {
    public static void main(String[] args) {
        EquationSolving1_2 EquationSolving1_2 = new EquationSolving1_2();
        EquationSolving1_2.input(0,7,3);
        if(EquationSolving1_2.solve()) {
            EquationSolving1_2.print();
        }
        System.out.println("程序结束。");
    }
}
