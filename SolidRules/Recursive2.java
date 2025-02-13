package SolidRules;

public class Recursive2 {
  public static void main(String[] args) {
    System.out.println("Hello World");
    // main(new String[0]); skip this
    if (args.length < 5) {
      main(new String[args.length + 1]);
    }
  }
}
