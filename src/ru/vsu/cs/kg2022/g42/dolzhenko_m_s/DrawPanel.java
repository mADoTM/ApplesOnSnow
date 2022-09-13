package ru.vsu.cs.kg2022.g42.dolzhenko_m_s;

import ru.vsu.cs.kg2022.g42.dolzhenko_m_s.Drawables.Picture;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private Picture applesOnSnow;

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gr2D = (Graphics2D) g;

        applesOnSnow = new Picture(getWidth(), getHeight());
        applesOnSnow.draw(gr2D);
    }
}
