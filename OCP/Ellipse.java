public class Ellipse extends Shape {
    private double major;
    private double minor;

    public Ellipse(double major, double minor) {
        this.major = major;
        this.minor = minor;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (this.major)/2 * (this.minor)/2;
    }
}