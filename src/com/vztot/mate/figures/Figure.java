package com.vztot.mate.figures;

public abstract class Figure {
    private String name;
    private String color;
    private double area;

    public Figure(String name, String color, double area) {
        this.name = name;
        this.color = color;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }
}