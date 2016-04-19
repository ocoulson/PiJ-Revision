import java.util.List;

/**
 * Created by Oliver Coulson on 19/04/2016.
 */
public class HighLow {
    public static void main(String[] args) {
        HighLow highLow = new HighLow();
        highLow.run();
    }

    public void run() {
        List<Integer> integerList = Utilities.getNumberSequence();

        int first = integerList.get(0);
        int second = integerList.get(1);
        boolean ascending;
        String output = "Yes";

        if (first < second) {
            ascending = true;
        } else if (first > second) {
            ascending = false;
        } else {
            ascending = false;
            output = "No";
        }

        for (int i = 0; i < integerList.size()-1; i++) {
            if(ascending) {
                if (integerList.get(i)+1 != integerList.get(i+1)) {
                    output = "No";
                    break;
                }
            }
            else {
                if (integerList.get(i)-1 != integerList.get(i+1)) {
                    output = "No";
                    break;
                }
            }
        }
        System.out.println(output);

    }
}
