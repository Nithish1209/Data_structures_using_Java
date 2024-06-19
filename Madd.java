import java.util.*;

class Madd {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        
        // Define the dimensions of the array
        int r = 2;
        int c = 2;

        // Correct the array declaration and initialization
        int[][] a = new int[r][c];

        if (r == c) {
            // Use < instead of <= in the loop conditions
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    a[i][j] = rd.nextInt();
                }
            }

            // Use < instead of <= in the loop conditions
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    // Use print instead of println to print on the same line
                    System.out.print(a[i][j] + " ");
                }
                // Add a new line after each row
                System.out.println();
            }
        } else {
            System.out.println("Rows and columns must be equal for a square matrix.");
        }
    }
}
