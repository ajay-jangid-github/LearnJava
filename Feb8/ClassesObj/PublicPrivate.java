package Feb8.ClassesObj;

//public means-- we can access class memmber anywhere.
//private means-- we can access only within class..
//or ek baat or hain ki.. hum ek se jyada public , enum, interface ek hi file mein nhi rakh sakte hain...

class bus { // we are using public access modifier here..
  public String name; // ise hum kisi bhi class mein access kar skate hai..
  private int number; // lrkin isse keveal class ke andar hi access kar skte hai

  public void setNumber(int num) { // here we set the private variable in public method
    number = num;
  }

  public int getNumber() {
    return number;
  }
}

public class PublicPrivate { // or yaha par hata diya hai... public ko...

  public static void main(String[] args) {
    bus obj = new bus();
    obj.name = "Audi";
    obj.setNumber(7788);

    // display() method ko print kara diya
    System.out.println("name" + obj.name);
    System.out.println("Bus Number: " + obj.getNumber());
    // obj.getNumber();
  }
}
