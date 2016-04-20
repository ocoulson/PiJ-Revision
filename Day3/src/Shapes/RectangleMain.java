package Shapes;

/**
 * Created by Oliver Coulson on 20/04/2016.
 */
public class RectangleMain {
    public static void main(String[] args) {

        Rectangle rectangle = ShapesUtil.getRectangle();

        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}
