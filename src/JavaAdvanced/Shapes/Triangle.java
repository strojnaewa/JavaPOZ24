package JavaAdvanced.Shapes;

public class Triangle extends Polygon {
    private int baseLength;
    private int height;
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int baseLength, int height, int sideA, int sideB, int sideC) {

        this.baseLength = baseLength;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }



    public double getArea(){
        return baseLength*height*0.5;
    }

    public double getPeriphery (){
        return sideA+sideB+sideC;
    }

    public int getEdges(){
        return 3;
    }
}
