package ExecutionFlow;
//java program execution flow---->

//when we run java program that time JVM follow specific steps,
//complitation phase---javac -write java code in .java file name and the compiler convert it into byte code(.class file).
//phir loading phase--JVM load  .class file and initialize static block and static variables
//step 3 -- JVM call main() method if not found then it will generate error the main method not found.

public class ExecutionFlow {
  static {
    System.out.println("from static block"); // so phle static block execute hoga phir main method....
  }

  public static void main(String[] args) {
    System.out.println("Hi from main method block");
  }
}
