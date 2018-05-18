/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figure;

/**
 *
 * @author amr19
 */
public class Circle extends Figure{
    private double radius;
    
    public Circle(double x, double y, double radius){
        super(x, y);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
}
