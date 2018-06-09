/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figure;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Albert
 */
public class AreaDoublerTest {
    private Circle c;
    private Rectangle r;
    
    @Before
    public void setup(){
        c = new Circle(1, 1, 2);
        r = new Rectangle(1, 1, 2, 2);
    }

    @Test
    public void testDoubleCircleArea() {
        double d = getCircleArea(c);
        AreaDoubler ad = new AreaDoubler();
        c.accept(ad);
        Circle doubledCircle = (Circle) ad.getDoubledFigure();
        double d1 = getCircleArea(doubledCircle);
        assertEquals(2*d, d1, 0.00000000001);
        assertNotEquals(c, doubledCircle);
    }
    
    @Test
    public void testDoubleRectangleArea(){
        double area = getRectangleArea(r);
        AreaDoubler ad = new AreaDoubler();
        r.accept(ad);
        Rectangle doubledRectangle = (Rectangle) ad.getDoubledFigure();
        double doubledArea = getRectangleArea(doubledRectangle);
        assertEquals(2*area, doubledArea, 0.00000000001);
        assertNotSame(r, doubledRectangle);
    }
    
    @Test
    public void testDrawing(){
        DrawingBuilder db = new DrawingBuilder(1, 1);
        AreaDoubler ad = new AreaDoubler();
        Drawing d = db.addFigure(c).addFigure(r).build();
        d.accept(ad);
        Drawing newDrawing = (Drawing) ad.getDoubledFigure();
        Circle newCircle = (Circle) newDrawing.getComponents().get(0);
        Rectangle newRectangle = (Rectangle) newDrawing.getComponents().get(1);
        assertEquals(getRectangleArea(r) * 2, getRectangleArea(newRectangle), 0.00000000001);
        assertEquals(getCircleArea(c) * 2, getCircleArea(newCircle), 0.00000000001);
        assertNotSame(d, newDrawing);
    }
    
    private double getRectangleArea(Rectangle r){
        return r.getHeight() * r.getWidth();
    }
    
    private double getCircleArea(Circle c){
        return Math.PI * Math.pow(c.getRadius(), 2);
    }    
}
