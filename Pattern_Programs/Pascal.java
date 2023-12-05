// Print Pascal's Triangle in Java
//import java.io.*;
/*
class Pascal {
	public int factorial(int i)
	{
		if (i == 0)
			return 1;
		return i * factorial(i - 1);
	}
	public static void main(String[] args)
	{
		int n = 4, i, j;
		Pascal g = new Pascal();
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= n - i; j++) {

				// for left spacing
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {

				// nCr formula
				System.out.print(
					" "
					+ g.factorial(i)
						/ (g.factorial(i - j)
							* g.factorial(j)));
			}

			// for newline
			System.out.println();
		}
	}
}
*/
public class PascalMain {
    public static void main(String[] args) {
        Pascal p = new Pascal();
        p.printUseRecursion(5);
    }
}

class Pascal {
    public int factorial(int i) {
        if (i == 0) {
            return 1;
        }
        return i * factorial(i - 1);
    }

    public void printUseRecursion(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(" " + factorial(i) / (factorial(i - k) * factorial(k)));
            }

            System.out.println();
        }
    }
}

