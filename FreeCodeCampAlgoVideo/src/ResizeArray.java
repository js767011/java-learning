public class ResizeArray {
  
  public int[] resize(int[] arr, int capacity){
    int[] temp = new int[capacity];
    for(int i=0; i<arr.length; i++){
      temp[i] = arr[i];
    }
    return temp;
  }

  public void printArray(int[] arr) {
    int n = arr.length;
    for (int i=0; i < n; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args){
    ResizeArray resize = new ResizeArray();
    //resize.printArray(new int[] {5, 1, 2, 9, 10});
    int[] original = new int[] {5,1,2,9,10};
    System.out.println("The size of the original array is " + original.length);
    original = resize.resize(original, 10);
    resize.printArray(original);
    System.out.println("The size of the array is now " + original.length);
  }
}
