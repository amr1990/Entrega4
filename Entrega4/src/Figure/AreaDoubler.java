/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figure;

import java.util.Iterator;

/**
 *
 * @author Albert
 */
public class AreaDoubler implements FigureVisitor{
    private Rectangle r;
    private Circle c;
    private Drawing d;

    @Override
    public void visit(Rectangle rectangle) {
        r =  new Rectangle(rectangle.getX(), 
                           rectangle.getY(), 
                           rectangle.getWidth() * Math.sqrt(2.0), 
                           rectangle.getHeight() * Math.sqrt(2.0));
    }

    @Override
    public void visit(Circle circle) {
        c = new Circle(circle.getX(),
                       circle.getY(),
                       circle.getRadius());
    }

    @Override
    public void visit(Drawing drawing) {
        DrawingBuilder db= new DrawingBuilder(drawing.getX(),drawing.getY());
        Iterator<Figure> drawingIterator = drawing.getComponents().iterator();
        
        while(drawingIterator.hasNext()){
            Figure f = drawingIterator.next();
            f.accept(this);
            db.addFigure(f);
        }
        d = db.build();
    }
    
}
