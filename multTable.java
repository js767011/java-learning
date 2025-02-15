import java.util.Scanner;

public class multTable {
  public static void main(String[] args){
    Scanner firstScanner = new Scanner(System.in);
    System.out.println("Let's pratice our multiplication tables! Please enter a number between 0 and 12: ");
    int mult = firstScanner.nextInt();
    firstScanner.close();

    if(mult < 0 || mult > 12) {
      System.out.println("Sorry! You've entered an invalid number");
    } else {
      for(int i = 0; i < 13; i++) {
        System.out.println(mult + " x " + i + " = " + (mult*i));
      }
    }
  }
}
