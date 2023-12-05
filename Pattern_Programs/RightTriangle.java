/* program to print the pattern
  
    *
   **
  ***
 ****
*****
  
Repeat the external loop to print columns of the triangle.
Inside this loop use, 2 different loops first to print spaces and second to print stars.
At the end of each row, create a new line.
  */





public class RightTriangle {
  public static void main(String[] args) {

    // size of the triangle
    int size = 5;
    // loop to print the pattern
    for (int i = 0; i < size; i++) {
      // print spaces
      for (int j = 1; j < size - i; j++) {
        System.out.print(" ");
      }
      // print stars
      for (int k = 0; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}