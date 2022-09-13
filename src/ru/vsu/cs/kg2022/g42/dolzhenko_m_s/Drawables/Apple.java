package ru.vsu.cs.kg2022.g42.dolzhenko_m_s.Drawables;

import java.awt.*;

public final class Apple extends AbstractDrawableObject {
    private final Leaf leaf;
    private final AppleSpot spot;

    private final int radius;

    public Apple(int x, int y, Color mainColor, int radius) {
        super(x,y,mainColor);
        this.radius = radius;
        this.leaf = new Leaf(x, y, mainColor, radius);
        this.spot = new AppleSpot(x, y, mainColor, radius);
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(getMainColor());
        gr.fillOval(getX(), getY(), radius * 2, radius * 2);

        leaf.draw(gr);
        spot.draw(gr);
    }
}
