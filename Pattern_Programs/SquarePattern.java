/* program to print the following pattern

**********
**********
**********
**********
**********
  
1.Define the size of the square (or you can take user input).
2.Create a nested loop where the external loop is the number of rows and the inner loop is the number of columns.
3.Print the star in each column and print a new line after each row.

*/











public class SquarePattern {
  public static void main(String[] args) {

    // size of the square
    int rowsize = 5;
    int colsize=10;
    // outer loop
    for (int i = 0; i < rowsize; i++)
    {
      // inner loop
      for (int j = 0; j < colsize; j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}