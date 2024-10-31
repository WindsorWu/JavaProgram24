public class Father extends GrandFather{
    Father(float h,float w){
        System.out.println("这是父类的构造函数");
        height = h;
        weight = w;
        money=700000;
        money = super.money+money;
    }

    Float height;
    Float weight;
    int money;
    void speak(){
        System.out.println("这是父类的Speak");
    }
    int money(){
        return money;
    }
    void work(){
        super.work();
        System.out.println("WORK IN FACTORY.");
    }
}
