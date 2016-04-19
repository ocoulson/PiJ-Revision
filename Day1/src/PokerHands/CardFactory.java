package PokerHands;

import java.util.Scanner;

/**
 * Created by Oliver Coulson on 19/04/2016.
 */
public class CardFactory {


    private Hand hand = new Hand();


    public void createCard() {
        boolean valid = true;
        do {
            int rank = getRankInput();
            char suit = getSuitInput();

            Card card = new Card(rank, suit);

            System.out.println(card.toString());

            for (Card c : hand.getCards()) {
                if (card.equals(c)) {
                    System.out.println("Card already exists");
                    valid = false;
                    break;
                }
            }
            if (valid) {
                hand.add(card);

            }
        } while (!valid);
    }


    public Hand getHand() {
        return hand;
    }
    private int getRankInput() {

        boolean valid = true;
        int output = 0;
        do {
            System.out.println("Input card rank: A/1,2,3,4,5,6,7,8,9,10,J,Q,K");
            System.out.print("> ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.length() >= 2) {
                if (!input.equals("10")) {
                    valid = false;
                } else {
                    output = Integer.parseInt(input);
                }
            } else if (input.length() != 1) {
                valid = false;
            } else {
                if (Character.isDigit(input.charAt(0))) {
                    if (input.charAt(0) == '0') {
                        valid = false;
                    } else {
                        output = Integer.parseInt(input);
                        valid = true;
                    }
                } else {
                    char inputChar = input.toUpperCase().charAt(0);
                    switch (inputChar) {
                        case 'A':
                            output = 1;
                            valid = true;
                            break;
                        case 'J':
                            output = 11;
                            valid = true;
                            break;
                        case 'Q':
                            output = 12;
                            valid = true;
                            break;
                        case 'K':
                            output = 13;
                            valid = true;
                            break;
                        default:
                            valid = false;
                            break;
                    }
                }
            }
            if(!valid) System.out.println("Invalid rank");
        } while (!valid);
        return output;
    }

    private char getSuitInput() {

        boolean valid = true;
        char output = '0';
        do {
            System.out.println("Input card suit: C/Clubs, D/Diamonds, H/Hearts, S/Spades");
            System.out.print("> ");
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine().toUpperCase();
            char inputChar = input.charAt(0);
            if (inputChar != 'C' && inputChar != 'D' && inputChar != 'H' && inputChar != 'S') {
                valid = false;
                System.out.println("invalid Rank");
            } else {
                output = inputChar;
            }
        } while (!valid);

        return output;
    }
}
