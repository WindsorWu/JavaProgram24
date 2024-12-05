public class Cat extends Animal{
    @Override
    public String getAnimalName() {
        return "猫";
    }

    @Override
    public void cry() {
        System.out.println("喵");
    }
}
