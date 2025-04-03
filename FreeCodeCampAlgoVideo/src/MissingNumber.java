//Given an array of n-1 discrete numbers in the range of
// 1 to n, find the missing number in the array.
// ex. arr[] = {2, 4, 1, 8, 6, 3, 7}
// ans: the missing number is 5.
// To solve, remember that the sum of the first n natural numbers is
// nums = n * (n+1)/2

public class MissingNumber {
  public int findMissingNumber(int[] arr){
    int n = arr.length+1;
    int sum = n * (n+1)/2;
    for (int num : arr){
      sum = sum - num;
    }
    return sum;
  }

  public void arrayDemo() {
    int[] array = {1, 3, 6, 8, 2, 4, 7};
    System.out.println("The missing number is: " + findMissingNumber(array));
  }

  public static void main(String[] args) {
      MissingNumber missing = new MissingNumber();
      missing.arrayDemo();

  }
}
