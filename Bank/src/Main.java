// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Bank bank=new Bank();
        Thread t1=new Thread(bank);
        Thread t2=new Thread(bank);
        t1.setName("会计");
        t2.setName("出纳");

        t1.start();
        t2.start();
    }
}