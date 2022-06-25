import java.util.Scanner;

public class Replace {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n = input.nextInt();
        int rem = 0, rev = 0;
        while (n > 0) {
            rem = n % 10;
            if (rem == 0) {
                rem = 1;
            }
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        System.out.println("The output is :" + rev);

    }
}
