package Feb7;

public class ArrayTravsing {

  public static void main(String[] args) {
    int[] Arry1 = { 10, 20, 30, 40 };

    // for (int i = 0; i < Arry1.length; i++) {
    // System.out.println(Arry1[i]);
    // }
    // }
    for (int num : Arry1) {
      System.out.println(num);
    }

  }
}
