package com.bridgelabz;

import java.util.Random;

public class DeckOfCards {
    Card[] cards;
    String[] suits = {"Club","Diamond", "Heart", "Spade"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
    public DeckOfCards(){
        cards = initializeCards();
    }
    public Card[] initializeCards(){
        Card[] cards = new Card[52];
        int cardIndex = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                cards[cardIndex] = new Card(suit, rank);
                cardIndex++;
            }
        }
        return cards;
    }

    public void shuffle(Card[] cards){
        Random random = new Random();
        Card card;
        for(int i = 0; i < 52; i++){
            int index = random.nextInt(52);
            int index2 = random.nextInt(52);
            card = cards[index];
            cards[index] = cards[index2];
            cards[index2] = card;
        }
    }
    public void distributeCards(Card[][] players){
        int playersIndex = 0;
        shuffle(this.cards);
        for(int i = 0; i < players.length; i++){
            for(int j = 0; j < players[i].length; j++){
                players[i][j] = cards[playersIndex];
                playersIndex++;
            }
        }
    }
    public void print(Card[][] players){
        for(int i = 0; i < players.length; i++){
            System.out.print("Player" + (i+1) + " Cards: ");
            for(int j = 0; j < players[i].length; j++){
                System.out.print(players[i][j].suit + "-" + players[i][j].rank + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        DeckOfCards deckOfCards = new DeckOfCards();
        Card[][] players = new Card[4][9];
        deckOfCards.distributeCards(players);
        System.out.println("After Shuffle");
        for(int i = 0; i < deckOfCards.cards.length; i++){
            System.out.print(deckOfCards.cards[i].suit + "-" + deckOfCards.cards[i].rank + " ");
        }
        System.out.println();
        System.out.println("Cards received by players");
        deckOfCards.print(players);
    }
}
