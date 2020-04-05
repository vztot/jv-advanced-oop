package com.vztot.mate.figures;

public class Trapeze extends Figure implements Drawable {

    private double lengthOfHigherSide;
    private double lengthOfLowerSide;
    private double height;

    public Trapeze(String color,
                   double lengthOfHigherSide,
                   double lengthOfLowerSide,
                   double height) {
        super("трапеция",
                color,
                (lengthOfHigherSide + lengthOfLowerSide) * height * 0.5);
        this.lengthOfHigherSide = lengthOfHigherSide;
        this.lengthOfLowerSide = lengthOfLowerSide;
        this.height = height;
    }

    public double getLengthOfHigherSide() {
        return lengthOfHigherSide;
    }

    public double getLengthOfLowerSide() {
        return lengthOfLowerSide;
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
                getLengthOfHigherSide(),
                getLengthOfLowerSide(),
                getHeight(),
                getColor()
        );
    }
}
