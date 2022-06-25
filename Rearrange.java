import java.util.Scanner;

public class Rearrange {

    static void rearrangeArray(int A[], int n) {

        int i, j = 0;
        for (i = 0; i < n; i++) {
            if (A[i] < 0) {
                if (i != j) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
                j++;
            }
        }
    }

    static void printArray(int A[], int n) {
        System.out.println("Array after rearranging positive and negative");
        for (int i = 0; i < n; i++) {
            System.out.println(A[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = input.nextInt();

        int A[] = new int[n];
        System.out.println("Enter the lement of array:");
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }

        rearrangeArray(A, n);
        printArray(A, n);
    }
}
