package ExecutionFlow;
//Multithreading -- it is the way to complete the multiple task together...

//main purpose is performance improving.....

class MyThread extends Thread {
  public void run() {
    System.out.println("Thread running");
  }
}

public class Multithreading {
  public static void main(String[] args) {
    MyThread obj = new MyThread();
    obj.start();
  }
}
