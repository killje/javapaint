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
        Shape circleForTheI = new Circle();
        circleForTheI.setCircle(10, 10, 10);
        circleForTheI.setProperties(false, Color.RED);
        
        Shape OuterCircleForP = new Circle();
        OuterCircleForP.setCircle(45, 30, 30);
        OuterCircleForP.setProperties(true, Color.GREEN);

        Shape InnerCircleForP = new Circle();
        InnerCircleForP.setCircle(45, 30, 15);
        InnerCircleForP.setProperties(true, Color.WHITE);
        
        /* set default shape of a filled rectangle */
        Shape rectForI = new Rectangle();
        rectForI.setRectangle(0, 25, 20, 100);
        rectForI.setProperties(true, Color.RED);
        
        Shape rectForP = new Rectangle();
        rectForP.setRectangle(0, 0, 25, 125);
        rectForP.setProperties(true, Color.GREEN);
        
        Shape rectForK = new Rectangle();
        rectForK.setRectangle(0, 0, 25, 125);
        rectForK.setProperties(true, Color.BLUE);
        
        Shape outerTriangleForK = new Polygon();
        outerTriangleForK.setTriangle(70, 0, 10, 70, 70, 125);
        outerTriangleForK.setProperties(true, Color.BLUE);

        Shape innerTriangleForK = new Polygon();
        innerTriangleForK.setTriangle(70, 20, 40, 70, 70, 105);
        innerTriangleForK.setProperties(true, Color.WHITE);
        
        Shape quadriliantForExlemationPoint = new Polygon();
        quadriliantForExlemationPoint.setQuadrangle(0, 0, 30, 10, 25, 100, 5, 90);
        quadriliantForExlemationPoint.setProperties(true, Color.YELLOW);

        Shape circleForExlemationPoint = new Circle();
        circleForExlemationPoint.setSquare(5, 105, 20);
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

        System.out.println("1");
        charP.draw(pc, 10, 10);
        System.out.println("2");
        charI.draw(pc, 80, 55);
        System.out.println("3");
        charI.draw(pc, 120, 90);
        System.out.println("4");
        charI.draw(pc, 160, 130);
        System.out.println("5");
        charK.draw(pc, 200, 170);
        System.out.println("6");
        charI.draw(pc, 280, 210);
        System.out.println("7");
        exlemationPoint.draw(pc, 320, 250);
    }
}
