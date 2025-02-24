public class Eagle implements Flyable {
    @Override
    public void move() {
        System.out.println("This Eagle walks.");
    }

    @Override
    public void fly() {
        System.out.println("This Eagle flies.");
    }
}