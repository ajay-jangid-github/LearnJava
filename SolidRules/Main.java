//srp- single responsibility principle  
// ek class ka sirf ek hi kam..one class related to only one field..

package SolidRules;

// class HelloAjay {
//   public void ajayHello() {
//     System.out.println("Hello from Ajay");
//   }

//   public void byAjay() {
//     System.out.println("By from Ajay");
//   }

//   public static void main(String[] args) {
//     HelloAjay obj = new HelloAjay(); // creating an object
//     obj.ajayHello(); // calling method
//     obj.byAjay();// calling method
//   }
// }

//problem is- one class handle two method...

//solution ---Ab har class sirf ek kaam kar rahi hai. Maintain karna easy ho gaya!
class HelloAjay {
  public void helloAjay() {
    System.out.println("Hello from Ajay");
  }
}

class ByAjay {
  public void byAjay() {
    System.out.println("By from Ajay");
  }
}

public class Main {
  public static void main(String[] args) {
    HelloAjay obj1 = new HelloAjay();
    ByAjay obj2 = new ByAjay();

    obj1.helloAjay();
    obj2.byAjay();
  }
}