//A simple algorithm to find the minimum in an array of integers

public class FindMin{
  public int findMinimum(int[] arr){
    //edge case
    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException("Invalid Input");
    }

    int min = arr[0]; //set the initial minimum as the first index of the array, as far as we know this is the min since we havent iterated over the array yet
    for (int i=1; i < arr.length; i++){
      if (arr[i] < min){
        min = arr[i];
      }
    }
    return min;
  }

  public static void main(String[] args) {
    int[] arr = {5, 3, 9, 15, 0, 2, -6, Integer.MIN_VALUE};
    FindMin ma = new FindMin();
    System.out.println(ma.findMinimum(arr));
  }
}