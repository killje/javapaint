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

    private int posX, posY;
    private int width, height;

    public Rectangle(int x, int y, int width, int height) {
        posX = x;
        posY = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int width) {
        this(x, y, width, width);
    }

    @Override
    public void draw(PaintContainer pc, int xOffset, int yOffset) {
        pc.getDrawingArea().setColor(color);
        if (isFilled()) {
            pc.getDrawingArea().fillRect(xOffset + posX, yOffset + posY, width, height);
        } else {
            pc.getDrawingArea().drawRect(xOffset + posX, yOffset + posY, width, height);
        }
        pc.repaint();
    }
}
