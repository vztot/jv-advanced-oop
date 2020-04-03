package com.vztot.mate.figures;

public class Circle extends Figure implements Drawable {

    private double radius;

    public Circle(String color, double radius) {
        super("круг", color, Math.PI * radius * radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.printf("Фигура: %s,"
                        + " площадь: %f кв. ед.,"
                        + " радиус: %f ед.,"
                        + " цвет: %s\n",
                getName(),
                getArea(),
                getRadius(),
                getColor()
        );
    }
}
