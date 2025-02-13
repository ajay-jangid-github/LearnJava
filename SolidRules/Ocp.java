package SolidRules;

//old method---if we add new customer, then change/modify the existing code..

class DiscountCalculator {
  public double getDiscount(String customerType) {
    if (customerType.equals("Regular")) {
      return 10;
    } else if (customerType.equals("Premium")) {
      return 20;
    }
    return 0;
  }
}

public class Ocp {
  public static void main(String[] args) {
    DiscountCalculator obj = new DiscountCalculator();

    // Testing the existing method with different customer types
    System.out.println("Regular Customer Discount: " + obj.getDiscount("Regular") + "%");
    System.out.println("Premium Customer Discount: " + obj.getDiscount("Premium") + "%");

    // Adding a new customer type, this will require code modification in
    // DiscountCalculator
    // Let's say we want to add a Gold customer
    System.out.println("Gold Customer Discount: " + obj.getDiscount("Gold") + "%"); // This will return 0, as no //
                                                                                    // discount logic is defined for//
                                                                                    // "Gold" customer
  }
}
