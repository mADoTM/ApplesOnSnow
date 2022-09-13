package ru.vsu.cs.kg2022.g42.dolzhenko_m_s;

import java.awt.*;

public class DrawUtils {
    public static void drawSun (Graphics2D graphics2D,
                               int x, int y,
                               int radius,
                               int rayLength, int rayCount, Color color
                                ) {
        graphics2D.setColor(color);
        graphics2D.fillOval(x - radius,y - radius, radius * 2, radius * 2);


        double angle = Math.PI * 2 / rayCount;
        for(int i = 0; i < rayCount; i++) {
            int sourceX = (int) (x + radius * Math.cos(angle * i));
            int sourceY = (int) (y + radius * Math.sin(angle * i));
            int addX = (int) ((rayLength + radius) * Math.cos(angle * i)) + x;
            int addY = (int) ((rayLength + radius) * Math.sin(angle * i)) + y;
            graphics2D.drawLine(sourceX, sourceY, addX,addY);
        }
    }
}
