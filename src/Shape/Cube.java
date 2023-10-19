package Shape;

public class Cube extends ThreeDimentionalShape {
    @Override
    public void calculateArea(int side) {
        System.out.println(" Area for cube: " + (6 * (side * side)));
    }

    @Override
    public void calculateVolume(int side) {
        System.out.println("Volume for sphere: " + (side * side * side));
    }
}
