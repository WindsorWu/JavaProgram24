public class Cat implements Animal{
    @Override
    public void cry() {
        System.out.println("喵");
    }

    @Override
    public String getAnimalName() {
        return "猫";
    }
}
