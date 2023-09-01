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
    
    protected Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
