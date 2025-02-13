package Feb10;

import java.util.Scanner;

public class Prime {
  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter no.");
    int num = scanner.nextInt();
    scanner.close();

    if (isPrime(num)) {
      // System.out.print(num + "is a prime number");
      num += num;
      System.out.println(num);
    } else {
      System.out.print(num + "is not a prime number");
    }
  }
}
