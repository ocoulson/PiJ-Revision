package PokerHands;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Oliver Coulson on 19/04/2016.
 */
public class PokerHandler {

    public static void main(String[] args) {
        PokerHandler ph = new PokerHandler();
        ph.run();
    }

    public void run() {

        CardFactory factory = new CardFactory();
        while (factory.getHand().size() < 5) {
            factory.createCard();
        }
        System.out.println();
        List<Card> hand = factory.getHand().evaluate();

        String output = "";

        for (Card c :
                hand) {
            output += c.toString() + ", ";
        }

        System.out.println(output.substring(0, output.length()-1));


    }


}
