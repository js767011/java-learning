import java.util.Scanner;

public class simpleCalculator {
  public static void main(String[] args) {
    Scanner myFirstIn = new Scanner(System.in);
    System.out.println("Please enter the first number: ");
    int firstInt = myFirstIn.nextInt();
    myFirstIn.close();

    Scanner mySecondIn = new Scanner(System.in);
    System.out.println("Please enter the second number: ");
    int secondInt = mySecondIn.nextInt();
    mySecondIn.close();

    Scanner myOperator = new Scanner(System.in);
    System.out.println("Operator (choose from +, -, *, or /): ");
    String operator = myOperator.nextLine();
    myOperator.close();

    switch(operator) {
      case "+":
        System.out.println(firstInt + " + " + secondInt + " = " + (firstInt+secondInt));
        break;
      case "-":
        System.out.println(firstInt + " - " + secondInt + " = " + (firstInt-secondInt));
        break;
      case "*":
        System.out.println(firstInt + " * " + secondInt + " = " + (firstInt*secondInt));
        break;
      case "/":
        System.out.println(firstInt + " / " + secondInt + " = " + (firstInt/secondInt));
        break;
      default:
      System.out.println("Invalid Operator");
    }
  }
}
