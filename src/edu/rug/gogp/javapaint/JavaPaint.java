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

        // initialisation of Shape's
        Shape pOuterCircle = new Circle(45, 30, 30);
        Shape pInnerCircle = new Circle(45, 30, 15);
        Shape pRectangle = new Rectangle(0, 0, 25, 125);

        Shape iCircle = new Circle(10, 10, 10);
        Shape iRectangle = new Rectangle(0, 25, 20, 100);

        Shape kRectancle = new Rectangle(0, 0, 25, 125);
        Shape kOuterTriangle = new Polygon(new int[]{70, 10, 70}, new int[]{0, 70, 125});
        Shape kInnerTriangle = new Polygon(new int[]{70, 40, 70}, new int[]{20, 70, 105});

        Shape exclamationPointRectangle = new Rectangle(5, 105, 20);
        Shape exclamationPointQuadriliant = new Polygon(new int[]{0, 30, 25, 5}, new int[]{0, 10, 100, 90});

        // adding properties for Shape's
        pOuterCircle.setProperties(true, Color.GREEN);
        pInnerCircle.setProperties(true, Color.WHITE);
        pRectangle.setProperties(true, Color.GREEN);

        iCircle.setProperties(false, Color.RED);
        iRectangle.setProperties(true, Color.RED);

        kRectancle.setProperties(true, Color.BLUE);
        kOuterTriangle.setProperties(true, Color.BLUE);
        kInnerTriangle.setProperties(true, Color.WHITE);

        exclamationPointQuadriliant.setProperties(true, Color.YELLOW);
        exclamationPointRectangle.setProperties(false, Color.YELLOW);

        // initialisation of Compound's
        Compound charP = new Compound();
        Compound charI = new Compound();
        Compound charK = new Compound();
        Compound exlemationPoint = new Compound();

        // adding Shape's to compounds
        charP.addShape(pOuterCircle);
        charP.addShape(pInnerCircle);
        charP.addShape(pRectangle);

        charI.addShape(iCircle);
        charI.addShape(iRectangle);

        charK.addShape(kRectancle);
        charK.addShape(kOuterTriangle);
        charK.addShape(kInnerTriangle);

        exlemationPoint.addShape(exclamationPointQuadriliant);
        exlemationPoint.addShape(exclamationPointRectangle);

        // drawing of the compound's
        charP.draw(pc, 10, 10);
        charI.draw(pc, 80, 55);
        charI.draw(pc, 120, 90);
        charI.draw(pc, 160, 130);
        charK.draw(pc, 200, 170);
        charI.draw(pc, 280, 210);
        exlemationPoint.draw(pc, 320, 250);
    }
}
