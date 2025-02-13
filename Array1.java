package Feb7;

//Array- is a collection of fixed size type of data, and it is contigous memory - it is fast, and index start from zero

//1.how to declare Array
//int[] = arr; --recomndad way

//Alternative way---
//int arr[]; -- valid but less preferred;

//2. Memory Allocation-(intilizatpion)
//arr = new int[5]; 5 size ka array

//3. Declaration & initilzation ek saath
// int[] arr = new int[5]; //array size fix kar diya yaha.

//4.direct values ke saath initilzation
//int[] arr = {10,20,30,40}; //direct element store karna

//now we will learn and practice of how to access element of an array

public class Array1 {

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40 };
    System.out.println(arr[0]);
    System.out.println(arr[1]);
  }
}
