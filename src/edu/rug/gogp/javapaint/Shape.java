package edu.rug.gogp.javapaint;

import java.awt.Color;

/**
 * This class is used to represent two-dimensional geometric shapes which can be
 * drawn in a PaintContainer.
 */
public abstract class Shape {
    
    private boolean filled = false;
    private Color color = Color.BLACK;

    
    /**
     * 
     * @return boolean on whether or not this shape should be filled
     */
    protected boolean isFilled(){
        return filled;
    }
    
    /**
     *
     * @return what color the shape should be
     */
    protected Color getColor(){
        return color;
    }

    /**
     * Set the drawing properties.
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
     * @param xOffset the x offset from the top-left corner of PaintContainer
     * @param yOffset the y offset from the top-left corner of PaintContainer
     */
    public abstract void draw(PaintContainer pc, int xOffset, int yOffset);

}
