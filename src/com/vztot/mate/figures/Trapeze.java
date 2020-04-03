package com.vztot.mate.figures;

public class Trapeze extends Figure implements Drawable {

    private double sideA;
    private double sideB;
    private double height;

    public Trapeze(String color, double sideA, double sideB, double height) {
        super("трапеция", color, (sideA + sideB) * height * 0.5);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.printf("Фигура: %s, площадь: %f кв. ед.,"
                        + " длина стороны A: %f ед.,"
                        + " длина стороны B: %f ед.,"
                        + " высота: %f ед.,"
                        + " цвет: %s\n",
                getName(),
                getArea(),
                getSideA(),
                getSideB(),
                getHeight(),
                getColor()
        );
    }
}
