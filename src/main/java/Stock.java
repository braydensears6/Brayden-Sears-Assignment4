/*
  Stock Class. Creates a stock object with a name, purchase 
  price, and current price. Has setters and getters for each
  variable and it also can calculate the stocks profit/loss.
*/

public class Stock {

  //variables
  private String name;
  private double purchasePrice;
  private double currentPrice;

  //constructor
  Stock(String stockName, double StockPPrice, double stockCPrice) {

    this.name = stockName;
    this.purchasePrice = StockPPrice;
    this.currentPrice = stockCPrice;
    
  }
  
  //setter for name
  public void setName(String newName) {

    this.name = newName;
    
  }

  //getter for name
  public String getName() {
    
    return this.name;
    
  }

  //setter for purchase price
  public void setPurchasePrice(double newPurchasePrice) {
    
    this.purchasePrice = newPurchasePrice;
    
  }

  //getter for purchase price
  public double getPurchacePrice() {

    return this.purchasePrice;
    
  }

  //setter for current price
  public void setCurrentPrice(double newCurrentPrice) {

    this.currentPrice = newCurrentPrice;
    
  }

  //getter for current price
  public double getCurrentPrice() {

    return this.currentPrice;
    
  }

  //calculates and returns the profit/loss of the stock
  public double calculateProfit() {

    return this.currentPrice - this.purchasePrice;
    
  }
  
}