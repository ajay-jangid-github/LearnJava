package Feb8.ClassesObj;

//static means-we dont need to create an object of class, we will directly call it by method..
class Online {
  static String live = "Yes Live";// static

  static void showLive() {
    System.out.println("live," + live);
  }
}

public class Static {
  public static void main(String[] args) {
    Online.showLive();// call method directly
  }
}
