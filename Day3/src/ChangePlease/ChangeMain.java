package ChangePlease;

/**
 * Created by Oliver Coulson on 20/04/2016.
 */
public class ChangeMain {
    public static void main(String[] args) {
        ChangeMain cm = new ChangeMain();

        cm.run();
    }

    public void run() {
        System.out.println("Input price:");
        double price = ChangeUtil.getInput();

        System.out.println("Input amount paid");
        double paid = ChangeUtil.getInput();

        if (paid < price) {
            System.out.println("Insufficient paid.");
        } else if(paid == price) {
            System.out.println("Exact amount paid.");
        } else {
            calculateChange(paid - price);
        }
    }

    public void calculateChange(double change) {
        int fifties = 0;
        int twenties = 0;
        int tens = 0;
        int fives = 0;
        int twoPounds = 0;
        int onePound = 0;
        int fiftyP = 0;
        int twentyP = 0;
        int tenP = 0;
        int fiveP = 0;
        int twoP = 0;
        int oneP = 0;

        if (change > 50) {
            fifties = (int) change / 50;
            change = change - (50 * fifties);
        }
        if (change > 20) {
            twenties = (int) change / 20;
            change = change - (20 * twenties);
        }
        if (change > 10) {
            tens = (int) change / 10;
            change = change - (10 * tens);
        }
        if (change > 5) {
            fives = (int) change / 5;
            change = change - (5 * fives);
        }
        if (change > 2) {
            twoPounds = (int) change / 2;
            change = change - (2 * twoPounds);
        }
        if (change > 1) {
            onePound = 1;
            change = change - 1;
        }
        if (change > 0.5) {
            fiftyP = 1;
            change = change - 0.5;
        }
        if (change > 0.2) {
            twentyP = 1;
            change = change - 0.2;
        }
        if (change > 0.1) {
            tenP = 1;
            change = change - 0.1;
        }
        if (change > 0.05) {
            fiveP = 1;
            change = change - 0.05;
        }
        if (change > 0.02) {
            twoP = (int) ((int) change / 0.02);
            change = change - (0.02 * twoP);
        }
        if (change > 0.01) {
            oneP = 1;
        }
        System.out.println("Change: ");
        System.out.println(fifties + " £50 notes");
        System.out.println(twenties + " £20 notes");
        System.out.println(tens + " £10 notes");
        System.out.println(fives + " £5 notes");
        System.out.println(twoPounds + " £2 coins");
        System.out.println(onePound + " £1 coins");
        System.out.println(fiftyP + " 50p coins");
        System.out.println(twentyP + " 20p coins");
        System.out.println(tenP + " 10p coins");
        System.out.println(fiveP + " 5p coins");
        System.out.println(twoP + " 2p coins");
        System.out.println(oneP + " 1p coins");
    }
}
