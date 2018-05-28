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
    private Figure f;

    @Override
    public void visit(Rectangle rectangle) {
        f =  new Rectangle(rectangle.getX(), 
                           rectangle.getY(), 
                           rectangle.getWidth() * Math.sqrt(2.0), 
                           rectangle.getHeight() * Math.sqrt(2.0));
    }

    @Override
    public void visit(Circle circle) {
        f = new Circle(circle.getX(),
                       circle.getY(),
                       circle.getRadius() * Math.sqrt(2.0));
    }

    @Override
    public void visit(Drawing drawing) {
        DrawingBuilder db= new DrawingBuilder(drawing.getX(),drawing.getY());
        Iterator<Figure> drawingIterator = drawing.getComponents().iterator();
        
        while(drawingIterator.hasNext()){
            AreaDoubler ad = new AreaDoubler();
            Figure figure = drawingIterator.next();
            figure.accept(ad);
            db.addFigure(ad.getDoubledFigure());
        }
        f = db.build();
    }
    
    public Figure getDoubledFigure(){
        return f;
    }
    
}
