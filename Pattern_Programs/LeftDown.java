/* program to print the pattern
  
*****
****
***
**
*
Take the size of your triangle.
Create an external loop to print rows of triangles.
Create an inner loop that print star for times equal to size minus the outer loop index.

  */





public class LeftDown {
  public static void main(String[] args) {

    // size of the triangle
    int size = 5;
    for (int i = 0; i < size; i++) 
    {
      // print stars
      for (int j = 0; j < size-i; j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}