
import java.util.Scanner;

public class Friendly {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter number 1:");
        n1 = input.nextInt();
        System.out.println("Enter number 2:");
        n2 = input.nextInt();

        int sum1 = 0, sum2 = 0;
        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0) {
                sum1 += i;
            }
        }
        for (int i = 1; i < n2; i++) {
            if (n2 % i == 0) {
                sum2 += i;
            }
        }
        if (sum1 == n2 && sum2 == n1) {
            System.out.println("Friendly pair");
        } else {
            System.out.println("Not friendly pair");
        }
    }
}
