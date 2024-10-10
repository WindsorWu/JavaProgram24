public class Equition {
    public Equition(int a, int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int a;
    int b;
    int c;
    double x1;
    double x2;

    boolean solve(){
        boolean result=true;
        if (a == 0) {
            System.out.println("此方程不是一元二次方程。");
            result=false;
        }
        else{
            if(b*b-4*a*c<0){
                System.out.println("此一元二次方程无解。");
                result=false;
            }
            else{
                x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
                x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);

            }
        }
        return result;
    }

    void print(){
        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);
    }
}
