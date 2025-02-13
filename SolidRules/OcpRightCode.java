package SolidRules;

// Step 1: Create an interface for Discount
interface Discount {
  double getDiscount();
}

// step 2 mein

class RegularCustomer implements Discount {
  public double getDiscount() {
    return 10; // get 10% discount
  }
}

class PremiumCustomer implements Discount {
  public double getDiscount() {
    return 20; // get 20% discount
  }
}

class CustomerDiscount {
  public double discountCustomer(Discount discount) {
    return discount.getDiscount();
  }
}

class GoldCustomer implements Discount {
  public double getDiscount() {
    return 30;
  }
}

public class OcpRightCode {
  public static void main(String[] args) {
    CustomerDiscount calculator = new CustomerDiscount();

    // now creating obj for diff. customer
    Discount regular = new RegularCustomer();
    Discount premimum = new PremiumCustomer();
    Discount gold = new GoldCustomer();
    // calculating discount
    System.out.println("regular customer dis" + calculator.discountCustomer(regular) + "%");
    System.out.println("premimum customer dis" + calculator.discountCustomer(premimum) + "%");
    System.out.println("gold customer dis" + calculator.discountCustomer(gold) + "%");

    // adding new customer

  }
}
