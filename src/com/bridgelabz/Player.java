package com.bridgelabz;

public class Player {
    Queue<Card> cardsQueue = new Queue<>();
    public void sort(Card[] cards){
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
        for (String rank : ranks) {
            for (Card card : cards)
                if (rank.equals(card.rank)) {
                    cardsQueue.enqueue(card);
                }
        }
    }
    public void display(){
        int size = cardsQueue.size();
        for(int i = 0; i < size; i++){
            Card temp = cardsQueue.dequeue();
            System.out.print(temp.suit + "-" + temp.rank+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Player[] players = new Player[4];
        DeckOfCards deckOfCards = new DeckOfCards();
        Card[][] player = new Card[4][9];
        deckOfCards.distributeCards(player);
        for(int i = 0; i < 4; i++){
            System.out.print("Player" + (i+1) + " cards :");
            players[i] = new Player();
            players[i].sort(player[i]);
            players[i].display();
        }
    }
}
