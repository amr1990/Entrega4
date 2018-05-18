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
public class Rectangle extends Figure{
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }
    
    public double getHeight(){
        return this.height;
    }
}
