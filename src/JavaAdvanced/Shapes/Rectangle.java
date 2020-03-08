package JavaAdvanced.Shapes;

public class Rectangle extends Polygon {


    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getPeriphery() {
        return 2 * sideA + 2 * sideB;
    }

    @Override
    public int getEdges() {
        return 4;
    }

}
