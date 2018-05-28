/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figure;

import java.util.List;

/**
 *
 * @author Albert
 */
public class DrawingVisitor implements FigureVisitor{
    
    public void visitComponents(List<Figure> components){
        for(Figure f : components){
            DrawingVisitor dv = new DrawingVisitor();
            f.accept(dv);
        }
    }

    @Override
    public void visit(Rectangle rectangle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Circle circle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Drawing drawing) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
