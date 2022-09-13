package ru.vsu.cs.kg2022.g42.dolzhenko_m_s.Drawables;

import ru.vsu.cs.kg2022.g42.dolzhenko_m_s.Drawables.AbstractDrawableObject;
import ru.vsu.cs.kg2022.g42.dolzhenko_m_s.Drawables.Apple;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public final class Picture extends AbstractDrawableObject {
    private final List<AbstractDrawableObject> items;

    public Picture(int width, int height) {
        this.items = new ArrayList<>();
        items.add(new Apple(450, 350, new Color(255, 0,0), 40));

        items.add(new Apple(300, 400, new Color(255, 0,0), 50));

        items.add(new Apple(400, 380, new Color(255, 0,0), 50));
        setWidth(width);
        setHeight(height);
    }

    @Override
    public void draw(Graphics2D gr) {
        drawSky(gr);
        drawSnowLand(gr);
        drawItems(gr);
    }

    private void drawSky(Graphics2D gr) {
        System.out.println("" + getWidth() + " " + getHeight() / 2);
        gr.setColor(new Color(0, 255,255));
        gr.fillRect(0,0, getWidth(),getHeight() / 2);
    }

    private void drawSnowLand(Graphics2D gr) {
        System.out.println("drawLand");
        gr.setColor(new Color(255, 255,255));
        gr.fillRect(0,getHeight() / 2, getWidth(),getHeight() / 2);
        gr.fillOval(-1 * (getWidth() / 10), getHeight() / 3, getWidth() / 4, getHeight() / 4);
        gr.fillOval(0, getHeight() / 3, getWidth() / 4, getHeight() / 4);
    }

    private void drawItems(Graphics2D gr) {
        for(var item : items) {
            item.draw(gr);
        }
    }
}
