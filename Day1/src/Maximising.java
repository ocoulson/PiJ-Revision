import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oliver Coulson on 19/04/2016.
 */
public class Maximising {

    public static void main(String[] args) {
        Maximising max = new Maximising();
        max.run();
    }

    public void run() {
        List<Integer> intList = Utilities.getNumberSequence();

        if (intList.isEmpty()) {
            System.out.println("You didn't enter any numbers");
        } else {
            int greatest = 0;
            for (Integer i : intList) {
                if (i > greatest) {
                    greatest = i;
                }
            }
            System.out.println("Highest entered number is: " + greatest);
        }
    }
}
