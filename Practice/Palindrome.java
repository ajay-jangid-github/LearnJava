package Practice;

class check {
  public boolean isPalindrome(int num) {
    int originalNum = num;
    int reveseNum = 0;

    while (num > 0) {
      int digit = num % 10;
      reveseNum = reveseNum * 10 + digit;
      num /= 10;

      if (originalNum == reveseNum) {
        return true;
      }
    }
    return false;

  }
}

public class Palindrome {
  public static void main(String[] args) {
    check obj = new check();
    System.out.println(obj.isPalindrome(33));
  }
}
