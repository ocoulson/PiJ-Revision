package PokerHands;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oliver Coulson on 19/04/2016.
 */
public class Hand {
    private List<Card> cards = new ArrayList<>();

    public List<Card> getCards() {
        return cards;
    }

    public void add(Card c) {
        cards.add(c);
        System.out.println("added, hand size: " + cards.size());
    }

    public int size() {
        return cards.size();
    }

    public List<Card> evaluate(){
        List <Card> sorted = aceSort();

        if (flush()) {
            if (straight(sorted)) {
                boolean hasKing = false;
                boolean hasAce = false;
                for (Card c: sorted) {
                    if (c.getRank() == 13) {
                        hasKing = true;
                    } else if (c.getRank() == 14) {
                        hasAce = true;
                    }
                }
                if(hasAce && hasKing) {
                    System.out.println("You have a royal flush!");
                } else System.out.println("You have a straight flush!");
            } else {
                System.out.println("You have a flush");
            }

        } else {
            if(straight(sorted)) {
                System.out.println("You have a straight");
            } else {
                System.out.println("Could be a anything, who knows!");
            }
        }
        return sorted;
    }

    private boolean flush() {
        char suit = cards.get(0).getSuit();

        for (Card c: cards) {
            if (c.getSuit() != suit) {
                return false;
            }
        }
        return true;
    }

    private boolean straight(List<Card> input) {

        for (int i = 0; i < input.size()-1; i ++) {
            if (input.get(i).getRank()+1 != input.get(i+1).getRank()){
                return false;
            }
        }

        return true;

    }

    private List<Card> aceSort() {
        List<Card> current = new ArrayList<>();
        boolean has2 = false;
        for(Card c: cards) {
            current.add(new Card(c.getRank(), c.getSuit()));
            if (c.getRank() == 2) {
                has2 = true;
            }
        }

        if (has2) {
            return sortAceLow(current);
        } else return sortAceHigh(current);
    }

    private List<Card> sortAceHigh(List<Card> current) {

        for (Card c :
                current) {
            if (c.getRank() == 1) {
                c.switchAceRank();
            }
        }
        return sort(current);
    }

    private List<Card> sortAceLow(List<Card> current) {
        return sort(current);
    }

    private List<Card> sort(List<Card> current) {
        List<Card> sorted = new ArrayList<>();
        while (sorted.size() < 5) {
            Card smallest = null;
            for (Card c : current) {
                if (smallest == null) {
                    smallest = c;
                } else if (c.getRank() < smallest.getRank()) {
                    smallest = c;
                }
            }
            sorted.add(smallest);
            current.remove(smallest);
        }
        return sorted;
    }
}
