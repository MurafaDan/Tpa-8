package Shape;

public class Sphere extends ThreeDimentionalShape{

        @Override
        public void calculateArea(int side) {
            System.out.println(" Area for sphere: " + (4 * 3.14 * (side * side)));
        }

        @Override
        public void calculateVolume(int side) {
            System.out.println(" Volume for sphere: " + ((4/3) * 3.14 * (side * side)));
        }
    }

