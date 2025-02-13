//we cannot override main method , but we can hiding it
package SolidRules;

class Override {
  public static void main(String[] args) {
    System.out.println("Parent main");
  }
}

class Child extends Override {
  public static void main(String[] args) {
    System.out.println("child maain");
  }
}
