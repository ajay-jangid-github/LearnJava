package Feb8.Encapsulation;

class BankAccount {
  private double balance;

  public void setBalance(double amount) {
    if (amount > 0)
      balance = amount;
  }

  public double getBalance() {
    return balance;
  }
}

public class DataHiding1 {
  public static void main(String[] args) {
    BankAccount obj = new BankAccount();
    obj.setBalance(2000.49);
    System.out.println("Your balance is" + obj.getBalance());
  }
}
