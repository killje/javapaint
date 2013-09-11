package edu.rug.gogp.javapaint;

/**
 *
 * @author Patrick Beuks (s2288842) & Rik Schaaf (s2391198)
 */
public class Polygon extends Shape {

    protected int[] xCoords;
    protected int[] yCoords;

    /**
     * Initializes this shape as a quadrangle.
     * 
     * @param x1 sets the first x coordinate of the quadrangle
     * @param y1 sets the first y coordinate of the quadrangle
     * @param ...
     */
    public Polygon(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        xCoords = new int[]{x1, x2, x3, x4};
        yCoords = new int[]{y1, y2, y3, y4};
    }

    /**
     * Initializes this shape as a triangle.
     * 
     * @param x1 sets the first x coordinate of the triangle
     * @param y1 sets the first y coordinate of the triangle
     * @param ...
     */
    public Polygon(int x1, int y1, int x2, int y2, int x3, int y3) {
        xCoords = new int[]{x1, x2, x3};
        yCoords = new int[]{y1, y2, y3};
    }

    private int[] getOffsetedArray(int[] array, int offset) {
        int[] returnArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            returnArray[i] = array[i] + offset;
        }
        return returnArray;
    }

    @Override
    public void draw(PaintContainer pc, int xOffset, int yOffset) {
        pc.getDrawingArea().setColor(getColor());
        if (isFilled()) {
            pc.getDrawingArea().fillPolygon(getOffsetedArray(xCoords, xOffset), getOffsetedArray(yCoords, yOffset), xCoords.length);
        } else {
            pc.getDrawingArea().drawPolygon(getOffsetedArray(xCoords, xOffset), getOffsetedArray(yCoords, yOffset), xCoords.length);
        }
        pc.repaint();
    }
}
