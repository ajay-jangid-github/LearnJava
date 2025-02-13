package ExecutionFlow;
//JVM - how to work internally?

//JVM - ok, jvm is a engine that execute the program-- it is divided by 3 parts--
//JVM - Archiecture
//class loader = .class loading, 
//runtime Memory areas -- 1.method area 2.heap, 3.stack

class JvmInternal {
  static int x = 10; // method area me store hoga
  int y = 2; // heap me store hoga ,accesbile only when we create an object..bcz this is
             // non-static variable..

  public static void main(String[] args) {
    JvmInternal obj = new JvmInternal(); // create object inside heap
    int z = 30; // stack memory

    System.out.println("method area" + x);
    System.out.println("heap memory" + obj.y);
    System.out.println("stack area" + z);
  }
}
