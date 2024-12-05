public class Simulator {
    public void playSound(Animal animal) {
        String name = animal.getAnimalName();
        System.out.println(name);
        animal.cry();
    }
}
