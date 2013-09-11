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

    int posX, posY, radius;

    public Circle(int x, int y, int radius) {
        posX = x;
        posY = y;
        this.radius = radius;
    }

    @Override
    public void draw(PaintContainer pc, int xOffset, int yOffset) {
        pc.getDrawingArea().setColor(color);
        if (isFilled()) {
            pc.getDrawingArea().fillOval(xOffset + posX - radius, yOffset + posY - radius, radius * 2, radius * 2);
        } else {
            pc.getDrawingArea().drawOval(xOffset + posX - radius, yOffset + posY - radius, radius * 2, radius * 2);
        }
        pc.repaint();
    }
}