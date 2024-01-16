package com.workintech.hw;

public class Ceiling {
    private int height;

    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    public void create() {
        System.out.println("Height : " + height + " and the color which is selected : " + paintedColor);
//        System.out.println("Height : " + getHeight() + " and the color which is selected : " + getPaintedColor());
    }
}
