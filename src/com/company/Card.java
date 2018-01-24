package com.company;

import java.util.Scanner;

public class Card {

    private Suits newSuits;
    private Ranks newRanks;

    Card(Suits myNewSuit, Ranks myNewRanks) {

        newSuits = myNewSuit;
        newRanks = myNewRanks;

    }

    public String yourInput() {

        Scanner source = new Scanner(System.in);
        System.out.println("Please tell me your choice: ");
        String yourChoice = source.nextLine();

        return yourChoice;
    }


    public Suits getNewSuits() {
        return newSuits;
    }

    public void setNewSuits(Suits newSuits) {
        this.newSuits = newSuits;
    }

    public Ranks getNewRanks() {
        return newRanks;
    }

    public void setNewRanks(Ranks newRanks) {
        this.newRanks = newRanks;
    }

    public void getDescription() {
        System.out.println("Your card is: " + newSuits + " " + newRanks);
    }


    public void choosingSuits() {

        System.out.println("Please tell me your Suit" + " " + Suits.HEARTS + " " + Suits.SPADES + " " + Suits.CLUBS + " " + Suits.DAIMONDS);
        String suits = yourInput();
        suits = suits.toUpperCase();

        setNewSuits(Suits.valueOf(suits));
        //System.out.println(getNewSuits());

    }

    public void choosingRanks() {
        System.out.println("Please tell me your Rank" + " " + Ranks.ACE + " " + Ranks.QUENN + " " + Ranks.JACK + " " + Ranks.KINGS);
        String ranks = yourInput();
        ranks = ranks.toUpperCase();

        setNewRanks(Ranks.valueOf(ranks));
        //System.out.println(getNewRanks());

    }


}
