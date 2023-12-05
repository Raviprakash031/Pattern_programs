/* 

program to print the pattern 
    *
   ***
  *****
 *******
*********
  
Take the size and create an external loop to print all rows.
Inside the outer loop, we have to create 2 inner loops. First for printing spaces and second for printing stars.
print number of spaces equal to size minus the outer loop index in the first inner loop.
Inside the second inner loop, print the number of stars equal to 2 times the outer loop index minus 1.
A the end of these 2 inner loops create a new line.
*/





public class Pyramid {
  // pyramid star pattern
  public static void main(String[] args) {

    int size = 5;
    for (int i = 0; i < size; i++) 
    {
      // print spaces
      for (int j = 0; j < size - i - 1; j++) 
      {
        System.out.print(" ");
      }
      // print stars
      for (int k = 0; k < 2 * i + 1; k++) 
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}