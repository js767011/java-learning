import java.util.Scanner;

public class isOdd {
  public static void main(String[] args) {
    Scanner inputNum = new Scanner(System.in);
    System.out.println("Please input a number to find out if it is even or odd!:");
    int val = inputNum.nextInt();
    inputNum.close();

    String message = (val % 2 == 0) ? (val + " is even!") : (val + " is odd!");
    System.out.println(message);
  }
}
