/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rug.gogp.javapaint;

import java.util.ArrayList;

/**
 *
 * @author s2288842
 */
public class Compound {

    private ArrayList<Shape> shapes = new ArrayList<>();

    /**
     * Draw the shape in the specified paintcontainer, with a specified extra
     * offset from the top-left corner of the paintcontainer.
     *
     * @param pc the PaintContainer to draw in
     * @param xoff the x offset from the top-left corner of pc
     * @param yoff the y offset from the top-left corner of pc
     */
    public void draw(PaintContainer pc, int xoff, int yoff) {
        for (Shape shape : shapes) {
            shape.draw(pc, xoff, yoff);
        }
        pc.repaint();
    }

    /**
     * Draw the shape in the specified paintcontainer, without an extra offset.
     *
     * @param pc the PaintContainer to draw in
     */
    public void draw(PaintContainer pc) {
        draw(pc, 0, 0);
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }
}
