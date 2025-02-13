package SolidRules;

class AreaCalculate {
  public double calculateArea(String shape, double value) {
    if (shape.equals("circle")) {
      return Math.PI * value * value;
    } else if (shape.equals("square")) {
      return value * value;
    }
    return 0;
  }
}

public class OcpExample2 {
  public static void main(String[] args) {
    AreaCalculate obj = new AreaCalculate();

    System.out.println("circle area" + obj.calculateArea("circle", 2));
    System.out.println("square area" + obj.calculateArea("square", 3));
    System.out.println("rectangle area" + obj.calculateArea("rectangle", 4));// add new shape---but need to be
                                                                             // change/modify class-- so thats why this
                                                                             // approach is not good.
  }
}
