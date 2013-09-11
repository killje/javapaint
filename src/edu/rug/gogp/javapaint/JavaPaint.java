package edu.rug.gogp.javapaint;

import java.awt.Color;

/**
 * The main program class of JavaPaint
 */
public class JavaPaint {

	public static void main(String args[]) {
            new JavaPaint();
    }

	/** Create a program instance */
    public JavaPaint() {
            /* Create a paint container */
            PaintContainer pc = new PaintContainer();

            /* Draw some stuff */

            Shape circle = new Shape();
            circle.setCircle(10, 10, 10);
            circle.setProperties(false, Color.RED);
            Shape rect = new Shape();
            rect.setRectangle(0, 25, 20, 100);
            rect.setProperties(true, Color.RED);
            Shape i = new Shape();

            i.setCompound();
            i.subShapes.add(circle);
            i.subShapes.add(rect);

            Shape rect2 = new Shape();
            rect2.setRectangle(0, 0, 25, 125);
            rect2.setProperties(true, Color.GREEN);

            Shape c1 = new Shape();
            c1.setCircle(45, 30, 30);
            c1.setProperties(true, Color.GREEN);

            Shape c2 = new Shape();
            c2.setCircle(45, 30, 15);
            c2.setProperties(true, Color.WHITE);

            Shape p = new Shape();
            p.setCompound();
            p.subShapes.add(c1);
            p.subShapes.add(c2);
            p.subShapes.add(rect2);

            Shape rect3 = new Shape();
            rect3.setRectangle(0, 0, 25, 125);
            rect3.setProperties(true, Color.BLUE);

            Shape tri1 = new Shape();
            tri1.setTriangle(70, 0, 10, 70, 70, 125);
            tri1.setProperties(true, Color.BLUE);

            Shape tri2 = new Shape();
            tri2.setTriangle(70, 20, 40, 70, 70, 105);
            tri2.setProperties(true, Color.WHITE);
            Shape k = new Shape();
            k.setCompound();
            k.subShapes.add(rect3);
            k.subShapes.add(tri1);
            k.subShapes.add(tri2);

            Shape quad = new Shape();
            quad.setQuadrangle(0, 0, 30, 10, 25, 100, 5, 90);
            quad.setProperties(true, Color.YELLOW);

            Shape sq = new Shape();
            sq.setSquare(5, 105, 20);
            sq.setProperties(false, Color.YELLOW);

            Shape fi = new Shape();
            fi.setCompound();
            fi.subShapes.add(quad);
            fi.subShapes.add(sq);

            p.draw(pc, 10, 10);
            i.draw(pc, 80, 55);
            i.draw(pc, 120, 90);
            i.draw(pc, 160, 130);
            k.draw(pc, 200, 170);
            i.draw(pc, 280, 210);
            fi.draw(pc, 320, 250);
    }
}
