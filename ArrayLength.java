package Feb7;

public class ArrayLength {
  public static void main(String[] args) {
    int[] len = { 10, 20, 30, 40 };
    // System.out.println(len.length); find length of an array
    len[0] = 30;
    // System.out.println(len[0]);
    for (int num : len) {
      System.out.println(num);
    }
  }
}
