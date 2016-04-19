package PokerHands;

/**
 * Created by Oliver Coulson on 19/04/2016.
 */
public class Card {
    private int rank;
    private final char suit;

    public Card(int rank, char suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void switchAceRank(){
        if (rank == 1){
            rank = 14;
        } else if (rank == 14) {
            rank = 1;
        }
    }

    public char getSuit() {
        return suit;
    }

    public boolean sameSuit(Card other) {
        return this.suit == other.suit;
    }
    public boolean sameRank(Card other) {
        return this.rank == other.rank;
    }


    public boolean equals(Card other) {
        return (sameSuit(other) && sameRank(other));
    }

    @Override
    public String toString() {
        String output = "";
        Integer rankInt = rank;
        if(rank <= 10 && rank > 1) {
            output += rankInt.toString();
        } else {
            switch (rank) {
                case 1: output += "Ace";
                    break;
                case 11: output += "Jack";
                    break;
                case 12: output += "Queen";
                    break;
                case 13: output += "King";
                    break;
                case 14: output += "Ace";
                    break;
            }
        }
        output += " of ";

        switch(suit) {
            case 'h': output += "Hearts";
                break;
            case 'H': output += "Hearts";
                break;
            case 'd': output += "Diamonds";
                break;
            case 'D': output += "Diamonds";
                break;
            case 'c': output += "Clubs";
                break;
            case 'C': output += "Clubs";
                break;
            case 's': output += "Spades";
                break;
            case 'S': output += "Spades";
                break;
        }
        return output;
    }
}
