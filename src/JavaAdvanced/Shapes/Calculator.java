package JavaAdvanced.Shapes;

import JavaAdvanced.Shapes.Shape;

import java.util.Random;

public class Calculator {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[20];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i]= getRandomShape();
            System.out.println("Figure "+shapes[i].getClass().getName().substring(20)+" || Periphery: "+shapes[i].getPeriphery()+" Area: "+shapes[i].getArea());
        }

    }

    private static Shape getRandomShape() {
        Random random = new Random();
        Shape result = null;
        switch (random.nextInt(4)) {
            case 0:
                result = new Circle(random.nextInt(30));
                break;
            case 1:
                result = new Square(random.nextInt(30));
                break;
            case 2:
                result = new Rectangle(random.nextInt(30), random.nextInt(30));
                break;
            case 3:
                result = new Triangle(random.nextInt(30), random.nextInt(30), random.nextInt(30), random.nextInt(30), random.nextInt(30));
                break;

        }
        return result;
    }

}



