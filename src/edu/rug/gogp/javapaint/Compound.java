package edu.rug.gogp.javapaint;

import java.util.ArrayList;

/**
 *
 * @author Patrick Beuks (s2288842) & Rik Schaaf (s2391198)
 */
public class Compound {

    private ArrayList<Shape> shapes = new ArrayList<>();

    /**
     * Draw the compound in the specified PaintContainer, with a specified extra
     * offset from the top-left corner of the PaintContainer.
     *
     * @param pc the PaintContainer to draw in
     * @param xoff the x offset from the top-left corner of PaintContainer
     * @param yoff the y offset from the top-left corner of PaintContainer
     */
    public void draw(PaintContainer pc, int xoff, int yoff) {
        for (Shape shape : shapes) {
            shape.draw(pc, xoff, yoff);
        }
        pc.repaint();
    }

    /**
     * Draw the compound in the specified PaintContainer, without an extra offset.
     *
     * @param pc the PaintContainer to draw in
     */
    public void draw(PaintContainer pc) {
        draw(pc, 0, 0);
    }

    
    /**
     * adds a shape to this compound
     * 
     * @param shape the shape that this compound should hold extra
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
}
