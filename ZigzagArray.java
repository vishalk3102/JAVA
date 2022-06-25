import java.util.Scanner;

public class ZigzagArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = input.nextInt();
        int A[] = new int[n];
        System.out.println("Enter the element of array :");
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1, c = 0; j < n - i; j++, c++) {
                if (c % 2 == 0) {
                    if (A[j - 1] > A[j]) {

                        temp = A[j - 1];
                        A[j - 1] = A[j];
                        A[j] = temp;
                    }
                } else {
                    if (A[j - 1] < A[j]) {
                        temp = A[j - 1];
                        A[j - 1] = A[j];
                        A[j] = temp;
                    }
                }
            }
        }
        System.out.println("Array after rerrage is :");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }

}
