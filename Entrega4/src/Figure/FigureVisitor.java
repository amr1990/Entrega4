/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figure;

/**
 *
 * @author Albert
 */
public interface FigureVisitor {
    public void visit(Rectangle rectangle);
    public void visit(Circle circle);
    public void visit(Drawing drawing);
}
