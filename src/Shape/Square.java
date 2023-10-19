package Shape;

public class Square extends TwoDimensionalShape{

    @Override
    public void calculateArea(int side) {
        System.out.println("Area for square: " + (3.14 * (side * side)));
    }
}
