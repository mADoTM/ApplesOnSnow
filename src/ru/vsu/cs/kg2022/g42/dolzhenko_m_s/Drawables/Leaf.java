package ru.vsu.cs.kg2022.g42.dolzhenko_m_s.Drawables;

import ru.vsu.cs.kg2022.g42.dolzhenko_m_s.Drawables.AbstractDrawableObject;

import java.awt.*;

public final class Leaf extends AbstractDrawableObject {
    private final int appleRadius;

    public Leaf(int x, int y, Color mainColor, int appleRadius) {
        super(x,y,mainColor);
        this.appleRadius = appleRadius;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(new Color(0, 255, 0));
        gr.fillArc(getX() + appleRadius, getY() - appleRadius / 2, appleRadius / 4, (int) ((appleRadius / 4) * 4.3), 45, 180);
    }
}
