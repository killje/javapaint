package edu.rug.gogp.javapaint;

/**
 *
 * @author Patrick Beuks (s2288842) & Rik Schaaf (s2391198)
 */
public class Rectangle extends Shape {

    private int posX, posY;
    private int width, height;

    /**
     * Initialize the shape as a rectangle
     *
     * @param x sets the x coordinate of the rectangle
     * @param y sets the y coordinate of the rectangle
     * @param width sets the width of the rectangle
     * @param height sets the height of the rectangle
     */
    public Rectangle(int x, int y, int width, int height) {
        posX = x;
        posY = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Initialize the shape as a square
     *
     * @param x sets the x coordinate of the square
     * @param y sets the y coordinate of the square
     * @param size sets the size of the square
     */
    public Rectangle(int x, int y, int size) {
        this(x, y, size, size);
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
