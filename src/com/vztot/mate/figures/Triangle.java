package com.vztot.mate.figures;

public class Triangle extends Figure implements Drawable {

    private double hypotenuse;
    private double heightHeldToHypotenuse;

    public Triangle(String color, double hypotenuse, double heightHeldToHypotenuse) {
        super("треугольник", color, heightHeldToHypotenuse * hypotenuse * 0.5);
        this.hypotenuse = hypotenuse;
        this.heightHeldToHypotenuse = heightHeldToHypotenuse;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public double getHeightHeldToHypotenuse() {
        return heightHeldToHypotenuse;
    }

    @Override
    public void draw() {
        System.out.printf("Фигура: %s,"
                        + " площадь: %f кв. ед.,"
                        + " длина гипотенузы: %f ед.,"
                        + " высота приведённая к гипотенузе: %f ед.,"
                        + " цвет: %s\n",
                getName(),
                getArea(),
                getHypotenuse(),
                getHeightHeldToHypotenuse(),
                getColor());
    }
}
