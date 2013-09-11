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

        @Override
        public void draw(PaintContainer pc, int xOffset, int yOffset) {
            if (filled) {
                pc.getDrawingArea().fillPolygon(xCoords, yCoords, xCoords.length);
            } else {
                pc.getDrawingArea().drawPolygon(xCoords, yCoords, xCoords.length);
            }
            pc.getDrawingArea().setColor(color);
            pc.repaint();
        }
    }
