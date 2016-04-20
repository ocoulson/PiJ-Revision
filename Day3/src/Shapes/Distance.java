package Shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Oliver Coulson on 20/04/2016.
 */
public class Distance {

    public static void main(String[] args) {
        Distance d = new Distance();
        d.run();
    }

    public void run() {
        System.out.println("First point");
        Point a = ShapesUtil.getPoint();
        System.out.println("\nSecond point");
        Point b = ShapesUtil.getPoint();
        System.out.println("\nThird point");
        Point c = ShapesUtil.getPoint();

        double abDistance = ShapesUtil.calculateDistance(a,b);
        double acDistance = ShapesUtil.calculateDistance(a,c);
        double bcDistance = ShapesUtil.calculateDistance(b,c);

        if (abDistance < acDistance && abDistance < bcDistance) {
            System.out.println("First and Second points are closest");
        } else if (acDistance < abDistance && acDistance < bcDistance) {
            System.out.println("First and Third points are closest");
        } else {
            System.out.println("Second and Third points are closest");
        }

    }


}
