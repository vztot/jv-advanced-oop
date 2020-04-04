package com.vztot.mate;

import com.vztot.mate.figures.Drawable;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Drawable> list = new ArrayList<>();

        int count = (int) (Math.random() * 100 + 1);

        for (int i = 0; i < count; i++) {
            list.add(FigureBuilder.buildRandomFigure());
        }
        for (Drawable figure : list) {
            figure.draw();
        }
    }
}
