/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.corrección_prada;
import java.lang.Math.*;
/**
 *
 * @author Daniel Prada
 * @version 08/29/23
 */
public class Circle extends Figure{
    
    private int radius;
    
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }
    
    @Override
    public double getPerimeter() {
        return (2*Math.PI*radius);
    }
    
}
