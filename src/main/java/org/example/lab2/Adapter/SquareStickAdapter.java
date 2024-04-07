package org.example.lab2.Adapter;

public class SquareStickAdapter extends RoundStick{
    private SquareStick stick;

    public SquareStickAdapter(SquareStick stick) {
        this.stick = stick;
    }

    public double getRadius() {
        // Вычислить половину диагонали квадратной палки по
        // теореме Пифагора.
        return stick.getWidth() * Math.sqrt(2) / 2;
    }
}
