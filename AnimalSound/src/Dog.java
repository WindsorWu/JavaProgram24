public class Dog extends Animal{
    @Override
    public String getAnimalName() {
        return "狗";
    }

    @Override
    public void cry() {
        System.out.println("汪");
    }
}
