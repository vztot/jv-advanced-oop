package com.vztot.mate.figures;

public class Square extends Figure implements Drawable {

    private double sideLength;

    public Square(String color, double sideLength) {
        super("квадрат", color, sideLength * sideLength);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public void draw() {
        System.out.printf("Фигура: %s," +
                " площадь: %f кв. ед.," +
                " длина стороны: %f ед.," +
                " цвет: %s\n",
                getName(),
                getArea(),
                getSideLength(),
                getColor()
        );
    }
}
