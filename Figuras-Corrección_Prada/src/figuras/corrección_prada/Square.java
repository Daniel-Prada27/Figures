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
public class Square extends Rectangle{
    
    private int side;
    
    public Square(int x, int y, int side) {
        super(x, y, side, side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    
}
