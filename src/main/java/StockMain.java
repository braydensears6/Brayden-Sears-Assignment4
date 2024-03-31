/*
  Stock Main Class. Imports scanner and then creates
  a new scanner object. Then it gets the number of
  stocks the user wants to input and creates an array
  of that size. Then it gets the name of the stock, 
  the purchase price, and the current price of the
  stock and makes a stock object in the array with
  those values. Then it prints out the name, purchase
  price, and current price of each stock and then the
  loss/profit. Then the total loss/profit is printed.
*/

import java.util.Scanner;

public class StockMain {

  //scanner object
  public static Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {

    //get number of stocks to analyze
    System.out.println("Enter the number of stocks to analyze: ");
    int numStocks = scanner.nextInt();

    //array of stocks
    Stock[] stocks = new Stock[numStocks];

    //loops through the array and assigns the user's values to it
    for (int i = 0; i < stocks.length; i++) {

      scanner.nextLine(); //consume new line character

      //name
      System.out.println("Enter the name of stock " + (i + 1) + ": ");
      String name = scanner.nextLine();

      //purchase price
      System.out.println("Enter the purchase price of stock " + (i + 1) + ": ");
      double purchasePrice = scanner.nextDouble();

      //current price
      System.out.println("Enter the current price of stock " + (i + 1) + ": ");
      double currentPrice = scanner.nextDouble();

      //assign values to new stock object
      stocks[i] = new Stock(name, purchasePrice, currentPrice);
      
    }

    double totalChange = 0; //total change variable, added on later
    System.out.println("\nStock Analysis:");

    //prints the data of each stock and the loss/profit
    for (int i = 0; i < stocks.length; i++) {

      //gets variables from stock object in the array
      String sName = stocks[i].getName();
      double sPurchasePrice = stocks[i].getPurchacePrice();
      double sCurrentPrice = stocks[i].getCurrentPrice();
      double change = stocks[i].calculateProfit();

      //formats and prints the varables out
      System.out.print(sName + " - Purchase Price: $" + String.format("%.2f", sPurchasePrice) + ", Current Price: $" + String.format("%.2f", sCurrentPrice));

      //prints loss instead of profit if the profit is negative
      //removes negative sign also
      if (change < 0) {

        System.out.println(" - Loss: $" + String.format("%.2f", (change * -1)));
        
      }

      //positive profit
      else {
        
        System.out.println(" - Profit: $" + String.format("%.2f", change));
        
      }

      totalChange += change; //adds to total change variable
      
    }

    //prints total change
    System.out.println("\nTotal Profit/Loss: $" + String.format("%.2f", totalChange));
  }
  
}