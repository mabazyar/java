import java.util.Scanner;
/**
 * This Java program calculates the value of a stock sale. 
 * The user will be prompted to enter the stock price, 
 * the number of shares to be sold, and the commission rate. 
 * The program will calculate the value of the shares by multiplying the stock price by the number of shares. 
 * It will also calculate the commission (the value of the shares multiplied by the commission rate) and the net proceeds 
 * (the value of the shares minus the commission).
 */
public class BrightSpace {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  // The user is prompted to enter the stock price
  System.out.println("Enter stock price: ");
  double stockPrice = input.nextDouble();
  // The user is prompted to enter the number of shares
  System.out.println("Enter number of shares: ");
  double numberOfShares = input.nextDouble();
  // The user is prompted to enter the commission rate
  System.out.println("Enter commission rate: ");
  double commissionRate = input.nextDouble();
  // Calculates the value of shares as per the given formula
  double valueOfShare = stockPrice * numberOfShares;
  // Calculates the commission as per the given formula
  double commission = valueOfShare * commissionRate / 100;
  // Calculates the net proceeds as per the given formula
  double netProceeds = valueOfShare - commission;
  // Prints out the value of share on the screen
  System.out.printf("Value of share: $%.2f\n", valueOfShare);
  // Prints out the commission on the screen
  System.out.printf("Commission: $%.4f\n", commission);
  // Prints out the net proceeds on the screen
  System.out.printf("Net proceeds: $%.4f\n", netProceeds);
 }
}
