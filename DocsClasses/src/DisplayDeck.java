// Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.

public class DisplayDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        int i = 1;
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                Card card = deck.getCard(suit, rank);
                System.out.format("%s. %s of %s%n",i,
                    Card.rankToString(card.getRank()),
                    Card.suitToString(card.getSuit()));
                i++;
            }
        }
    }
}
