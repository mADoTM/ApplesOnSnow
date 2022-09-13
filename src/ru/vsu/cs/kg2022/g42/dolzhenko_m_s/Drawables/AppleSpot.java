package ru.vsu.cs.kg2022.g42.dolzhenko_m_s.Drawables;

import ru.vsu.cs.kg2022.g42.dolzhenko_m_s.Drawables.AbstractDrawableObject;

import java.awt.*;

public final class AppleSpot extends AbstractDrawableObject {
    private final int appleRadius;

    public AppleSpot(int x, int y, Color mainColor, int appleRadius) {
        super(x,y,mainColor);
        this.appleRadius = appleRadius;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(new Color(240,230,140));
        gr.fillOval(getX() + appleRadius / 2,
                getY() + appleRadius / 2,
                appleRadius / 4,
                appleRadius / 2);
    }
}
