package Shapes;

/**
 * Created by Oliver Coulson on 20/04/2016.
 */
public class InsideOrOutsideMain {
    public static void main(String[] args) {



        Rectangle rectangle = ShapesUtil.getRectangle();

        System.out.println("Input a point");
        Point c = ShapesUtil.getPoint();

        if(rectangle.isInside(c)) {
            System.out.println("This point is inside the rectangle");
        } else System.out.println("this point is outside the rectangle");


    }
}
