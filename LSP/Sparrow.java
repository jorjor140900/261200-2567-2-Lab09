public class Sparrow implements Flyable {
    public void move() {
        System.out.println("This Sparrow walks.");
    }

    @Override
    public void fly() {
        System.out.println("This Sparrow flies.");
    }
}