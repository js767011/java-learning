// Given a string, check if the given string is a palindrome
// ex. "madam" should return true
// ex. "that" should return false

public class IsPalindrome {
  public boolean isPalindrome(String word){
    char[] charArray = word.toCharArray();
    int start = 0;
    int end = word.length()-1;
    while(start < end){
      if(charArray[start] != charArray[end]){
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

  public static void main(String[] args) {
      IsPalindrome palindrome = new IsPalindrome();
      String test = "madam";
      System.out.println("Is the word " + test + " a palindrome? True/False: "+ palindrome.isPalindrome(test));
  }
}
