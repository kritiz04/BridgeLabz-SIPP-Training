public class Circle {
    double radius;

    public Circle() {
        this(1.0);  // Constructor chaining
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void showArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(4.5);

        c1.showArea();
        c2.showArea();
    }
}
