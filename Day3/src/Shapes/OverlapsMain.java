package Shapes;

/**
 * Created by Oliver Coulson on 20/04/2016.
 */
public class OverlapsMain {
    public static void main(String[] args) {
        System.out.println("Input coordinates of 2 rectangles and a point");

        Rectangle first = ShapesUtil.getRectangle();
        Rectangle second = ShapesUtil.getRectangle();

        System.out.println("Input a point:");
        Point point = ShapesUtil.getPoint();

        if (first.isInside(point) && second.isInside(point)) {
            System.out.println("The point is inside both rectangles.");
        } else if (first.isInside(point)) {
            System.out.println("The point is inside the first rectangle.");
        } else if (second.isInside(point)) {
            System.out.println("The point is inside the second rectangle.");
        } else {
            System.out.println("The point is not in either rectangle.");
        }

    }

}
