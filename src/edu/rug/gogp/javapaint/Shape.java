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

    /*
     * The width and height rectangles.
     */

    /*
     * Corner coordinates for triangles and quadrangles.
     */

    /*
     * Radius for circles
     */
    
    /**
     * * Shape properties **
     */
    /*
     * Specifies whether this shape should be outlined or filled.
     */
    private boolean filled = false;

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
     * Set a quadrangle definition for this shape
     *
     * @param xa ... The x coordinates of the corner points
     * @param ya ... The y coordinates of the corner points
     */

    /**
     * Set a triangle definition for this shape
     *
     * @param xa ... The x coordinates of the corner points
     * @param ya ... The y coordinates of the corner points
     */
    protected boolean isFilled(){
        return filled;
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
