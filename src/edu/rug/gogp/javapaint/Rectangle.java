/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rug.gogp.javapaint;

/**
 *
 * @author s2288842
 */
public class Rectangle extends Shape {

        @Override
        public void draw(PaintContainer pc, int xOffset, int yOffset) {
            if (filled) {
                pc.getDrawingArea().fillOval(xOffset + posx - cradius, yOffset + posy - cradius,
                        cradius * 2, cradius * 2);
            } else {
                pc.getDrawingArea().drawOval(xOffset + posx - cradius, yOffset + posy - cradius,
                        cradius * 2, cradius * 2);
            }
            pc.getDrawingArea().setColor(color);
            pc.repaint();
        }
    }
