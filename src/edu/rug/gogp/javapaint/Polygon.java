/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rug.gogp.javapaint;

/**
 *
 * @author s2288842
 */
public class Polygon extends Shape {

    protected int[] xCoords;
    protected int[] yCoords;

    public Polygon(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        xCoords = new int[]{x1, x2, x3, x4};
        yCoords = new int[]{y1, y2, y3, y4};
    }

    public Polygon(int x1, int y1, int x2, int y2, int x3, int y3) {
        xCoords = new int[]{x1, x2, x3};
        yCoords = new int[]{y1, y2, y3};
    }

    public int[] getOffsetedArray(int[] array, int offset) {
        int[] returnArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            returnArray[i] = array[i] + offset;
        }
        return returnArray;
    }

    @Override
    public void draw(PaintContainer pc, int xOffset, int yOffset) {
        pc.getDrawingArea().setColor(color);
        if (isFilled()) {
            pc.getDrawingArea().fillPolygon(getOffsetedArray(xCoords, xOffset), getOffsetedArray(yCoords, yOffset), xCoords.length);
        } else {
            pc.getDrawingArea().drawPolygon(getOffsetedArray(xCoords, xOffset), getOffsetedArray(yCoords, yOffset), xCoords.length);
        }
        pc.repaint();
    }
}
