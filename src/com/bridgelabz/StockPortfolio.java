package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    double totalValue;
    int noOfStocks;
    Scanner scr = new Scanner(System.in);
    ArrayList<Stock> list = new ArrayList<>();


    public StockPortfolio() {
    }

    void stockPortfolio() {

        System.out.println("Enter no of stocks");
        noOfStocks = scr.nextInt();

        for (int i = 0; i < noOfStocks; i++) {
            Stock stock = new Stock();
            System.out.println("Enter stock name");
            stock.setStockName(scr.next());
            System.out.println("Enter number of shares");
            stock.setNoOfShares(scr.nextInt());
            System.out.println("Enter each share price");
            stock.setSharePrice( scr.nextDouble());
            list.add(stock);
            double stockValue = stock.getNoOfShares() * stock.getSharePrice();
            totalValue += stockValue;
        }
    }
    void display(){
        for(Stock stock : list){
            System.out.println(stock);
        }
    }
}
