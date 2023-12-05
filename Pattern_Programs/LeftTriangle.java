/*
program to print the pattern
  
*
**
***
****
*****
  
Take the size of the triangle.
Create a nested loop and repeat the outer loop for times equal to the size of the triangle.
Repeat the inner loop for times equal to the index of the outer loop and print star (*).
Use println to break the line after each row.
  */






public class LeftTriangle {
  public static void main(String[] args) {

    // size of the triangle
    int size = 5;
    // loop to print the pattern
    for (int i = 0; i < size; i++)
      {
      // print column
      for (int j = 0; j <= i; j++) 
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

