import java.util.Scanner;

public class multidimentopn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns for 1st matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Enter rows and columns for 2nd matrix:");
        int r1 = sc.nextInt();
        int c2 = sc.nextInt();

        // Check if multiplication possible
        if (c != r1) {
            System.out.println("Matrix multiplication NOT possible (columns of 1st != rows of 2nd)");
            return;
        }

        int[][] array = new int[r][c];
        int[][] array1 = new int[r1][c2];
        int[][] result = new int[r][c2];

        System.out.println("Enter elements of 1st matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of 2nd matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                array1[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < c; k++) {
                    result[i][j] += array[i][k] * array1[k][j];
                }
            }
        }
        // Printing result
        System.out.println("Multiplication Result:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
