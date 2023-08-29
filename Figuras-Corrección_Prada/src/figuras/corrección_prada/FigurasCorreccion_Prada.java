/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras.corrección_prada;

/**
 *
 * @author Daniel Prada
 * @version 08/29/23
 */
public class FigurasCorreccion_Prada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle(2, 0, 3);
        Rectangle rectangle = new Rectangle(0, 0, 2, 4);
        Square square = new Square(1, 1, 5);
        Triangle triangle = new Triangle(0, 0, 2);
        
        System.out.println("Circulo");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimetro: " + circle.getPerimeter());
        System.out.println("\nRectangulo");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimetro: " + rectangle.getPerimeter());
        System.out.println("\nCuadrado");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimetro: " + square.getPerimeter());
        System.out.println("\nTriangulo (equilatero)");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimetro: " + triangle.getPerimeter());
   }
    
}
