package Shape;

public class Circle extends TwoDimensionalShape{

    public void calculateArea(int side){
        System.out.println("Aria cercului este : " +(3.14*(side*side)));
        // PI * (R*R)
    }
}
