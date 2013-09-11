/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rug.gogp.javapaint;

/**
 *
 * @author s2288842
 */
public class Circle extends Shape {

        @Override
        public void draw(PaintContainer pc, int xOffset, int yOffset) {
            if (filled) {
                pc.getDrawingArea().fillRect(xOffset + posx, yOffset + posy, w, h);
            } else {
                pc.getDrawingArea().drawRect(xOffset + posx, yOffset + posy, w, h);
            }
            pc.getDrawingArea().setColor(color);
            pc.repaint();
        }
    }