/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.corrección_prada;

/**
 *
 * @author Daniel Prada
 * @version 08/29/23
 */
abstract public class Figure {
    private int x;
    private int y;
    
    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
    
}
