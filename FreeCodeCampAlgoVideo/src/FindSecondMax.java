public class FindSecondMax {
  
  int findSecondMax(int[] arr) {
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    for(int i=0; i < arr.length; i++) {
      if(arr[i] > max) {
        secondMax = max;
        max = arr[i];
      } else if(arr[i] > secondMax && arr[i] != max) {        
        secondMax = arr[i];
      }
    }
    return secondMax;
  }

  public static void main(String[] args) {
    int[] arr = {5, 3, 9, 15, 0, 2, -6, Integer.MIN_VALUE};
    FindSecondMax secMax = new FindSecondMax();
    System.out.println(secMax.findSecondMax(arr));
  }
}
