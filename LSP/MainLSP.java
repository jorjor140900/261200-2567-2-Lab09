public class MainLSP {
    public static void main(String[] args) {
        Moveable penguin = new Penguin();
        Moveable ostrich = new Ostrich();
        Flyable sparrow = new Sparrow();
        Flyable eagle = new Eagle();

        penguin.move();

        ostrich.move();

        sparrow.move();
        sparrow.fly();

        eagle.move();
        eagle.fly();
    }
}
