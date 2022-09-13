package ru.vsu.cs.kg2022.g42.dolzhenko_m_s.Drawables;

import java.awt.*;

public abstract class AbstractDrawableObject implements Drawable {
    private Color mainColor;
    private int x;
    private int y;
    private int height;
    private int width;

    public AbstractDrawableObject() { }

    public AbstractDrawableObject(int x, int y, Color mainColor) {
        this.x = x;
        this.y = y;
        this.mainColor = mainColor;
    }

    public Color getMainColor() {
        return mainColor;
    }

    public void setColor(Color mainColor) {
        this.mainColor = mainColor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    protected void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    protected void setWidth(int width) {
        this.width = width;
    }
}
