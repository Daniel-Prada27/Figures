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
public class Triangle extends Figure {

    int side;
    
    public Triangle(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }
    
    @Override
    public double getArea() {
        double height = Math.sqrt( Math.pow(side, 2) - Math.pow((side/2), 2));
        return height*(side/2);
    }
    
    @Override
    public double getPerimeter() {
        return side*3;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    
}
