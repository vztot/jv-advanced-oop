package com.vztot.mate;

import com.vztot.mate.figures.Circle;
import com.vztot.mate.figures.Drawable;
import com.vztot.mate.figures.Square;
import com.vztot.mate.figures.Trapeze;
import com.vztot.mate.figures.Triangle;

public class FigureBuilder {

    public static Drawable buildRandomFigure() {
        String[] colors = {
                "красный", "оранжевый", "жёлтый",
                "зелёный", "голубой", "синий",
                "фиолетовый", "белый", "чёрный"
        };

        int randomColorValue = (int) (Math.random() * (colors.length));
        int randomFigureValue = (int) (Math.random() * 4);

        switch (randomFigureValue) {
            case 0: {
                return new Square(colors[randomColorValue],
                        getRandomDoubleValue());
            }
            case 1: {
                return new Triangle(colors[randomColorValue],
                        getRandomDoubleValue(),
                        getRandomDoubleValue());
            }
            case 2: {
                return new Circle(colors[randomColorValue],
                        getRandomDoubleValue());
            }
            case 3: {
                return new Trapeze(colors[randomColorValue],
                        getRandomDoubleValue(),
                        getRandomDoubleValue(),
                        getRandomDoubleValue());
            }
        }
        return null;
    }

    static private double getRandomDoubleValue() {
        return Math.random() * 100 + 1;
    }
}
