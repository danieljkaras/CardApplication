package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


    Card newCard = new Card(Suits.HEARTS, Ranks.ACE );
    Card myNewCard = new Card(Suits.SPADES, Ranks.QUENN);




    newCard.choosingSuits();
    newCard.choosingRanks();

    //myNewCard.choosingSuits();
    //myNewCard.choosingRanks();

    newCard.getDescription();
    //myNewCard.getDescription();
    }
}
