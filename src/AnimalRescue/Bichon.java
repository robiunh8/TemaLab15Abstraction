package AnimalRescue;

public class Bichon extends Dog {
    @Override
    public void eat() {
        System.out.println("The bichon is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The bichon is sleeping");
    }

    @Override
    public void speak() {
        System.out.println("The bichon is barking");
    }

    @Override
    public void run() {
        System.out.println("The bichon is running around the room");
    }
}
