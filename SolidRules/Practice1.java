package SolidRules;
// public class Practice1 {

//   public static void main(String[] args) {
//     System.out.println("hello world");
//     main(new String[0]); // Recursive call but infinite and get error StackOverFlow; 
//   }

// }l

//right approach to do--recursion method

public class Practice1 {
  public static void main(String[] args) {
    System.out.println("Hello");

    if (args.length < 5) {
      main(new String[args.length + 1]);
    }
  }

}
