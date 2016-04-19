import java.util.List;

/**
 * Created by Oliver Coulson on 19/04/2016.
 */
public class GoingUp {
    public static void main(String[] args) {
        GoingUp goingUp = new GoingUp();

        goingUp.run();
    }

    public void run() {
        List<Integer> intList = Utilities.getNumberSequence();
        String output = "Yes";
        for (int i = 0; i < intList.size()-1; i ++) {
            if (intList.get(i)+1 != intList.get(i+1)){
                output = "No";
                break;
            }
        }

        System.out.println(output);
    }
}
