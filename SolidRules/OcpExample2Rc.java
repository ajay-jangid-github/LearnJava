package SolidRules;

//step1: creting interface for shape
interface Area {
  double getArea();
}

// step 2:creating class for different shape
class CircleArea implements Area {
  private double radius; // radius variable

  // constructor to initiate radius
  public CircleArea(double radius) {
    this.radius = radius;
  }

  // calculate area of circle
  public double getArea() {
    return Math.PI * radius * radius;
  }
}

class SquareArea implements Area {
  private double side; // side variable

  public SquareArea(double side) {
    this.side = side;
  }

  public double getArea() {
    return side * side; // calculate area
  }
}

class RectangleArea implements Area {
  private double length;
  private double breadth;

  public RectangleArea(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public double getArea() {
    return length * breadth;
  }
}

class AreaCalculator {
  public double calculateArea(Area area) {
    return area.getArea();
  }
}

// area calculator class
public class OcpExample2Rc {
  public static void main(String[] args) {
    AreaCalculator calculator = new AreaCalculator();

    // now creating obj. for diff shape
    Area circle = new CircleArea(5);
    Area square = new SquareArea(4);
    Area rectangle = new RectangleArea(2, 3);

    System.out.println("circle area" + calculator.calculateArea(circle));
    System.out.println("circle area" + calculator.calculateArea(square));
    System.out.println("rectangle area" + calculator.calculateArea(rectangle));
  }
}
