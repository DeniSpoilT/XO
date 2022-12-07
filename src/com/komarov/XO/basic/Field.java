package com.komarov.XO.basic;

import java.util.Arrays;

public class Field {

    private final Figure[][] figures;

    public Field() {
        this.figures = new Figure[3][3];
    }

    public Field(final Field field) {
        figures = new Figure[3][3];
        for (int i = 0; i < 3; i++) {
            System.arraycopy(field.figures[i], 0, figures[i], 0, 3);
        }
    }

    public void setFigure(final int x, final int y, final Figure figure) {
        figures[x][y] = figure;
    }

    public Figure getFigures(final int x, final int y) {
        return figures[x][y];
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Field field = (Field) o;

        return Arrays.deepEquals(figures, field.figures);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(figures);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                sb.append(figures[x][y] != null ? figures[x][y] : " ");
                if (x != 2) {
                    sb.append("|");
                } else {
                    sb.append("\n");
                }
            }
            if (y != 2) {
                sb.append("_____\n");
            }
        }
        return sb.toString();
    }
}
