package edu.rug.gogp.javapaint;

import java.awt.Color;

/**
 * The main program class of JavaPaint
 */
public class JavaPaint {

    public static void main(String args[]) {
        new JavaPaint();
    }

    /**
     * Create a program instance
     */
    public JavaPaint() {
        /* Create a paint container */
        PaintContainer pc = new PaintContainer();

        /* set default shape of a open circle */
        Shape circleForTheI = new Circle(10, 10, 10);
        circleForTheI.setProperties(false, Color.RED);
        
        Shape OuterCircleForP = new Circle(45, 30, 30);
        OuterCircleForP.setProperties(true, Color.GREEN);

        Shape InnerCircleForP = new Circle(45, 30, 15);
        InnerCircleForP.setProperties(true, Color.WHITE);
        
        /* set default shape of a filled rectangle */
        Shape rectForI = new Rectangle(0, 25, 20, 100);
        rectForI.setProperties(true, Color.RED);
        
        Shape rectForP = new Rectangle(0, 0, 25, 125);
        rectForP.setProperties(true, Color.GREEN);
        
        Shape rectForK = new Rectangle(0, 0, 25, 125);
        rectForK.setProperties(true, Color.BLUE);
        
        Shape outerTriangleForK = new Polygon(70, 0, 10, 70, 70, 125);
        outerTriangleForK.setProperties(true, Color.BLUE);

        Shape innerTriangleForK = new Polygon(70, 20, 40, 70, 70, 105);
        innerTriangleForK.setProperties(true, Color.WHITE);
        
        Shape quadriliantForExlemationPoint = new Polygon(0, 0, 30, 10, 25, 100, 5, 90);
        quadriliantForExlemationPoint.setProperties(true, Color.YELLOW);

        Shape circleForExlemationPoint = new Rectangle(5, 105, 20);
        circleForExlemationPoint.setProperties(false, Color.YELLOW);

        /* getting the shape if the letters */
        Compound charI = new Compound();
        charI.addShape(circleForTheI);
        charI.addShape(rectForI);

        Compound charP = new Compound();
        charP.addShape(OuterCircleForP);
        charP.addShape(InnerCircleForP);
        charP.addShape(rectForP);

        Compound charK = new Compound();
        charK.addShape(rectForK);
        charK.addShape(outerTriangleForK);
        charK.addShape(innerTriangleForK);

        Compound exlemationPoint = new Compound();
        exlemationPoint.addShape(quadriliantForExlemationPoint);
        exlemationPoint.addShape(circleForExlemationPoint);

        charP.draw(pc, 10, 10);
        charI.draw(pc, 80, 55);
        charI.draw(pc, 120, 90);
        charI.draw(pc, 160, 130);
        charK.draw(pc, 200, 170);
        charI.draw(pc, 280, 210);
        exlemationPoint.draw(pc, 320, 250);
    }
}
