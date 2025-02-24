public class MainOCP {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 7);
        Shape circle = new Circle(10);
        Shape ellipse = new Ellipse(18, 9);

        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Rectangle Area = " + calculator.calculateArea(rectangle));
        System.out.println("Circle Area = " + calculator.calculateArea(circle));
        System.out.println("Ellipse Area = " + calculator.calculateArea(ellipse));
    }
}