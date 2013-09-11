package edu.rug.gogp.javapaint;

/**
 *
 * @author Patrick Beuks (s2288842) & Rik Schaaf (s2391198)
 */
public class Rectangle extends Shape {

    private int posX, posY;
    private int width, height;

    public Rectangle(int x, int y, int width, int height) {
        posX = x;
        posY = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int width) {
        this(x, y, width, width);
    }

    @Override
    public void draw(PaintContainer pc, int xOffset, int yOffset) {
        pc.getDrawingArea().setColor(getColor());
        if (isFilled()) {
            pc.getDrawingArea().fillRect(xOffset + posX, yOffset + posY, width, height);
        } else {
            pc.getDrawingArea().drawRect(xOffset + posX, yOffset + posY, width, height);
        }
        pc.repaint();
    }
}
