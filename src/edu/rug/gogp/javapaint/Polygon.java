package edu.rug.gogp.javapaint;

/**
 *
 * @author Patrick Beuks (s2288842) & Rik Schaaf (s2391198)
 */
public class Polygon extends Shape {

    protected int[] xCoords;
    protected int[] yCoords;

    /**
     * Initializes this shape as a polygon.
     * 
     * @param xCoords sets the all the x coordinates of the polygon
     * @param yCoords sets the all the y coordinates of the polygon
     */
    public Polygon(int[] xCoords,int[] yCoords) {
        this.xCoords = xCoords;
        this.yCoords = yCoords;
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
