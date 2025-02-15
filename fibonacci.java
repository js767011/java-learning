import java.util.Scanner;

public class fibonacci {
  static int fib(int num) {
    if (num <= 1) {
      return num;
    }
      return fib(num - 1) + fib(num - 2);
  }

  public static void main(String[] args){
    Scanner fibInt = new Scanner(System.in);
    System.out.print("Please chose an integer for the number for the first N sequences of the Fibonacci sequence: ");
    int N = fibInt.nextInt();
    fibInt.close();

    for(int i = 0; i < N; i++){
      System.out.print(fib(i) + " ");
    }
  }

}
