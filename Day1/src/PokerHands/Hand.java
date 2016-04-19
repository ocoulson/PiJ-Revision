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
                findLikeCards(sorted);
            }
        }
        return sorted;
    }

    private void findLikeCards(List<Card> sorted) {
        List<Card> hand = new ArrayList<>();
        List<Card> firstLikeCards;
        List<Card> secondLikeCards;

        for(Card c : sorted) {
            hand.add(new Card(c.getRank(), c.getSuit()));
        }
        firstLikeCards = searchHandForLikeCards(hand);

        secondLikeCards = searchHandForLikeCards(hand);


        if (!firstLikeCards.isEmpty() && !secondLikeCards.isEmpty()) {
            String firstRank = firstLikeCards.get(0).toString().split(" ")[0] + "s";
            String secondRank = secondLikeCards.get(0).toString().split(" ")[0] + "s";

            if (firstLikeCards.size() == 3 || secondLikeCards.size() == 3) {
                System.out.println("You have a full house! - " + firstRank + " and " + secondRank);
            } else {
                System.out.println("You have 2 pair! - " + firstRank + " and " + secondRank);
            }

        } else if (!firstLikeCards.isEmpty()) {
            String rank = firstLikeCards.get(0).toString().split(" ")[0] + "s";
            if (firstLikeCards.size() == 4) {
                System.out.println("You have 4-of-a-kind! - " + rank);
            } else if (firstLikeCards.size() == 3) {
                System.out.println("You have 3-of-a-kind - " + rank);
            } else {
                System.out.println("You have a pair of " + rank);
            }
        } else {
            String rank = sorted.get(sorted.size()-1).toString().split(" ")[0];
            System.out.println("You have high card: " + rank);
        }
    }

    private List<Card> searchHandForLikeCards(List<Card> hand) {

        List<Card> likeCards = new ArrayList<>();

        for (int i = 0; i < hand.size() - 1; i++) {
            if (hand.get(i).getRank() == hand.get(i + 1).getRank()) {
                likeCards.add(hand.get(i));
                likeCards.add(hand.get(i + 1));
                break;
            }
        }
        for(Card c: likeCards) {
            hand.remove(c);
        }

        if (hand.size() > 0 && !likeCards.isEmpty()) {
            int rank = likeCards.get(0).getRank();
            for(int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getRank() == rank) {
                    likeCards.add(hand.get(i));
                }
            }
        }
        for(Card c: likeCards) {
            hand.remove(c);
        }

        return likeCards;
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
