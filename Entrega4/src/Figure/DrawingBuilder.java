/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figure;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Albert
 */
public class DrawingBuilder {
    private List<Figure> components = new ArrayList<>();
    private double x;
    private double y;
    
    public DrawingBuilder(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public DrawingBuilder addFigure(Figure f){
        components.add(f);
        return this;
    }
    
    public Drawing build(){
        return new Drawing(x, y, components);
    }
}
