/*program to print the following pattern

*****
*   *
*   *
*   *
*****
Set size of the square (or take user input.
Create a nested loop where the external loop executes the number of rows.
In the internal loop, print star in the first and last row and only at the first and last column.
Break the line after each row.
  */




public class HollowSquare {
  public static void main(String[] args) {

    // size of the square
    int size = 5;
    // outer loop
    for (int i = 0; i < size; i++) 
    {
      // inner loop
      for (int j = 0; j < size; j++)
        {
        // print only star in first and last row
        if (i == 0 || i == size - 1)
        {
          System.out.print("*");
        }
        else 
        {
          // print star only at first and last position row
          if (j == 0 || j == size - 1)
          {
            System.out.print("*");
          }
          else 
          {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}