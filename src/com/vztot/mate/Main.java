package com.vztot.mate;

import com.vztot.mate.figures.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        generateRandomArrayOfFiguresAndPrint();
    }

    private static void generateRandomArrayOfFiguresAndPrint() {

        int count = (int) (Math.random() * 100 + 1);
        List<Drawable> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            list.add(getRandomFigure());
        }

        for (Drawable figure : list) {
            figure.draw();
        }
    }

    private static Drawable getRandomFigure() {
        String[] colors = {
                "красный",
                "оранжевый",
                "жёлтый",
                "зелёный",
                "голубой",
                "синий",
                "фиолетовый",
                "белый",
                "чёрный"
        };
        int randomColorValue = (int) (Math.random() * (colors.length));
        int randomFigureValue = (int) (Math.random() * 4);

        switch (randomFigureValue) {
            case 0: {
                double sideLength = Math.random() * 100 + 1;
                return new Square(colors[randomColorValue], sideLength);
            }
            case 1: {
                double hypotenuse = Math.random() * 100 + 1;
                double heightHeldToHypotenuse = Math.random() * 100 + 1;
                return new Triangle(colors[randomColorValue], hypotenuse, heightHeldToHypotenuse);
            }
            case 2: {
                double radius = Math.random() * 100 + 1;
                return new Circle(colors[randomColorValue], radius);
            }
            case 3: {
                double sideA = Math.random() * 100 + 1;
                double sideB = Math.random() * 100 + 1;
                double height = Math.random() * 100 + 1;
                return new Trapeze(colors[randomColorValue], sideA, sideB, height);
            }
        }
        return null;
    }
}
