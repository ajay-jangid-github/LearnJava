package Feb8.Encapsulation;
// Encapsulation means-- make data private--and access from getter And Setter;

//Encapsulation ka fayda: Direct balance variable access nahi kar sakte, sirf setter & getter se.

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

public class DataHiding {

  public static void main(String[] args) {
    BankAccount obj = new BankAccount();
    obj.setBalance(2000.45);
    System.out.println("balance is " + obj.getBalance());
  }
}
