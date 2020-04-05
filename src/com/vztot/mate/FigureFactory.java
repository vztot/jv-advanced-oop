package com.vztot.mate;

import com.vztot.mate.figures.Circle;
import com.vztot.mate.figures.Drawable;
import com.vztot.mate.figures.Square;
import com.vztot.mate.figures.Trapeze;
import com.vztot.mate.figures.Triangle;

public class FigureFactory {

    public static Drawable createRandomFigure() {

        Drawable figure = null;

        String[] colors = {
                "красный", "оранжевый", "жёлтый",
                "зелёный", "голубой", "синий",
                "фиолетовый", "белый", "чёрный"
        };

        int randomColorValue = (int) (Math.random() * (colors.length));
        int randomFigureValue = (int) (Math.random() * 4);

        switch (randomFigureValue) {
            case 0: {
                figure = new Square(colors[randomColorValue],
                        getRandomDoubleValue());
                break;
            }
            case 1: {
                figure = new Triangle(colors[randomColorValue],
                        getRandomDoubleValue(),
                        getRandomDoubleValue());
                break;
            }
            case 2: {
                figure = new Circle(colors[randomColorValue],
                        getRandomDoubleValue());
                break;
            }
            case 3: {
                figure = new Trapeze(colors[randomColorValue],
                        getRandomDoubleValue(),
                        getRandomDoubleValue(),
                        getRandomDoubleValue());
                break;
            }
            default: {
            }
        }
        return figure;
    }

    static private double getRandomDoubleValue() {
        return Math.random() * 100 + 1;
    }
}
