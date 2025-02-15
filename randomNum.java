import java.util.Scanner;

public class randomNum {
  public static void main(String[] args){
    int randomNum = (int)(Math.random() * 101);

    Scanner val = new Scanner(System.in);
    System.out.println("Please guess a number between 0 and 100!:");
    int guessVal = val.nextInt();

    while (guessVal != randomNum) {
      if (guessVal > randomNum) {
        System.out.println("Sorry! Guess a smaller number:");
        guessVal = val.nextInt();
      }
      else if (guessVal < randomNum) {
        System.out.println("Sorry! Guess a larger number:");
        guessVal = val.nextInt();
      }
    }
    val.close();
    System.out.println("Congratulations! You guessed the correct number of " + guessVal);
  }
}
