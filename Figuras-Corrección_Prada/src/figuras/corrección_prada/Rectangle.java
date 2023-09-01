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
public class Rectangle extends Figure{
    private int base;
    private int height;

    public Rectangle(int x, int y, int base, int height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return base*height;
    }
    
    public double getPerimeter() {
        return 2*(base+height);
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
    
}
