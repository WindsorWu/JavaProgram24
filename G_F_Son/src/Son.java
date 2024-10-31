public class Son extends Father{
    int money;
    Son(){
        super(1.75f,70.0f);
        System.out.println("这是子类的构造函数");
    }
    String name;
    String getName(){
        System.out.println("这是子类的getName方法");
        return name;
    }
    int getMoney(){
        super.money();
        return money;
    }
    void work(){
        super.work();
        System.out.println("WORK AS I LIKE.");
    }
}
