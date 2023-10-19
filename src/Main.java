import Shape.Circle;
import Shape.Cube;
import Shape.Sphere;
import Shape.Square;
import paralelogram.Parallelogram;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Parallelogram figura = new Parallelogram();
        System.out.println("Itemul 2:");
        System.out.println("Perimeter: " +  figura.calculatePerimeter(5, 5));
        System.out.println("Perimeter: " + figura.calculatePerimeter(5));

        System.out.println("Area: " + figura.calculateArea(5, 5));
        System.out.println("Area: " + figura.calculateArea(5));

        System.out.println("Itemul 3:");
        Circle circle = new Circle();
        circle.calculateArea(4);

        Square square = new Square();
        square.calculateArea(6);

        Sphere sphere = new Sphere();
        sphere.calculateArea(9);
        sphere.calculateVolume(4);

        Cube cube = new Cube();
        cube.calculateArea(7);
        cube.calculateVolume(4);







    }
}