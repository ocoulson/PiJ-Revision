/**
 * Created by Oliver Coulson on 19/04/2016.
 */
public class NaiveSorting {

    public static void main(String[] args) {

        int a = Utilities.getIntegerInput();
        int b = Utilities.getIntegerInput();
        int c = Utilities.getIntegerInput();

        int[] array = {a,b,c};
        System.out.println(array[0] + ", " + array[1] + ", " + array[2]);

        for (int j = 0; j < 2; j ++) {

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] >= array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }


        System.out.println(array[0] + ", " + array[1] + ", " + array[2]);

    }


}
