import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        double p = 0.0, r = 0.0, a = 0.0;

        System.out.println("Type 1 : Term Deposit");
        System.out.println("Type 1 : Recurring Deposit");
        System.out.println("Enter the choice:");
        int ch = input.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter the principal amount :");
                p = input.nextDouble();
                System.out.println("Enter the rate of interest :");
                r = input.nextDouble();
                System.out.println("Enter the time in years :");
                n = input.nextInt();

                a = (p * r * n) / 100;
                System.out.println("Maturity amount = " + a);

                break;
            case 2:
                System.out.println("Enter the principal amount :");
                p = input.nextDouble();
                System.out.println("Enter the rate of interest :");
                r = input.nextDouble();
                System.out.println("Enter the time in years :");
                n = input.nextInt();
                a = p * Math.pow(1 + r / 100, n);
                System.out.println("Maturity amount = " + a);
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
