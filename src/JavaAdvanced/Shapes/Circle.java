package JavaAdvanced.Shapes;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14*radius*radius;
    }

        public double getPeriphery() {
        return 2*3.14*radius;
    }
}
