public class Dog implements Animal{
    @Override
    public void cry() {
        System.out.println("汪");
    }

    @Override
    public String getAnimalName() {
        return "狗";
    }
}
