/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figure;

import static java.util.Collections.unmodifiableList;
import java.util.List;

/**
 *
 * @author amr19
 */
public class Drawing extends Figure{
    private List<Figure> components;
    
    public Drawing(double x, double y, List<Figure> components) {
        super(x, y);
        this.components = components;
    }
    
    public List<Figure> getComponents(){
        return unmodifiableList(this.components);
    }
    
    public void accept(FigureVisitor figureVisitor){
        figureVisitor.visit(this);
    }
}
