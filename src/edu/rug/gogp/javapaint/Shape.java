package edu.rug.gogp.javapaint;

import java.awt.Color;

/**
 * This class is used to represent two-dimensional geometric shapes which can be
 * drawn in a PaintContainer.
 */
public abstract class Shape {

    /**
     * * Shape types **
     */
    /*
     * A compound shape is a special shape that consists of zero or more other
     * shapes. The other types represent primitive geometric shapes.
     */

    /* The type of this shape */

    /*
     * The position of the shape (center for circles, top-left corner for
     * squares and rectangles.
     */
    protected int posx, posy;

    /*
     * The width and height rectangles.
     */
    protected int w, h;

    /*
     * Corner coordinates for triangles and quadrangles.
     */
    protected int[] xCoords;
    protected int[] yCoords;

    /*
     * Radius for circles
     */
    protected int cradius;
    /**
     * * Shape properties **
     */
    /*
     * Specifies whether this shape should be outlined or filled.
     */
    protected boolean filled = false;

    /*
     * The color of the shape
     */
    protected Color color = Color.BLACK;

    /**
     * Create a new shape
     */
    public Shape() {
    }

    /**
     * Set a circle definition for this shape
     *
     * @param x The x coordinate of the circle center
     * @param y The y coordinate of the circle center
     * @param radius The radius of the circle
     */
    public void setCircle(int x, int y, int radius) {
        cradius = radius;
        posx = x;
        posy = y;
    }

    /**
     * Set a square definition for this shape
     *
     * @param x The x coordinate of the top-left corner of the square
     * @param y The y coordinate of the top-left corner of the square
     * @param width The width and height of the square
     */
    public void setSquare(int x, int y, int width) {
        setRectangle(x, y, width, width);
    }

    /**
     * Set a square definition for this shape
     *
     * @param x The x coordinate of the top-left corner of the square
     * @param y The y coordinate of the top-left corner of the square
     * @param width The width of the rectangle
     * @param height The height of the rectangle
     */
    public void setRectangle(int x, int y, int width, int height) {
        w = width;
        h = height;
        posx = x;
        posy = y;
    }

    /**
     * Set a quadrangle definition for this shape
     *
     * @param xa ... The x coordinates of the corner points
     * @param ya ... The y coordinates of the corner points
     */
    public void setQuadrangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        xCoords = new int[]{x1, x2, x3, x4};
        yCoords = new int[]{y1, y2, y3, y4};
    }

    /**
     * Set a triangle definition for this shape
     *
     * @param xa ... The x coordinates of the corner points
     * @param ya ... The y coordinates of the corner points
     */
    public void setTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        xCoords = new int[]{x1, x2, x3};
        yCoords = new int[]{y1, y2, y3};
    }

    /**
     * Set the drawing properties, like filled or not, and the color for this
     * shape. This only works with primitive shapes!
     *
     * @param fill Whether this shape should be filled or not
     * @param color The color of this shape
     */
    public void setProperties(boolean fill, Color color) {
        filled = fill;
        this.color = color;
    }

    /**
     * Draw the shape in the specified PaintContainer, without an extra offset.
     *
     * @param pc the PaintContainer to draw in
     */
    public void draw(PaintContainer pc) {
        draw(pc, 0, 0);
    }

    /**
     * Draw the shape in the specified PaintContainer, with a specified extra
     * offset from the top-left corner of the PaintContainer.
     *
     * @param pc the PaintContainer to draw in
     * @param xOffset the x offset from the top-left corner of pc
     * @param yOffset the y offset from the top-left corner of pc
     */
    public abstract void draw(PaintContainer pc, int xOffset, int yOffset);

}
