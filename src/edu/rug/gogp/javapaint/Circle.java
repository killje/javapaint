package edu.rug.gogp.javapaint;

/**
 *
 * @author Patrick Beuks (s2288842) & Rik Schaaf (s2391198)
 */
public class Circle extends Shape {

    int posX, posY, radius;

    public Circle(int x, int y, int radius) {
        posX = x;
        posY = y;
        this.radius = radius;
    }

    @Override
    public void draw(PaintContainer pc, int xOffset, int yOffset) {
        pc.getDrawingArea().setColor(getColor());
        if (isFilled()) {
            pc.getDrawingArea().fillOval(xOffset + posX - radius, yOffset + posY - radius, radius * 2, radius * 2);
        } else {
            pc.getDrawingArea().drawOval(xOffset + posX - radius, yOffset + posY - radius, radius * 2, radius * 2);
        }
        pc.repaint();
    }
}