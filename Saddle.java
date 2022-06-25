import java.util.Scanner;

public class Saddle {

    static int saddlePoint(int A[][], int n, int m) {
        int point = 0;
        int min, max;

        for (int i = 0; i < n; i++) {
            min = A[i][0];
            for (int j = 0; j < m; j++) {
                max = A[0][j];
                if (min > A[i][j]) {
                    min = A[i][j];
                }
                if (max < A[i][j]) {
                    max = A[i][j];
                }
                if (min == max) {
                    point = min;
                }
            }
        }
        return point;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int n = input.nextInt();
        System.out.println("Enter the number of column:");
        int m = input.nextInt();

        int A[][] = new int[n][m];
        System.out.println("Enter the element of array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = input.nextInt();
            }

        }
        System.out.println("Saddle point is :" + saddlePoint(A, n, m));
    }
}
