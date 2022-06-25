import java.util.*;
import java.lang.Math;

public class myCalculator {

	private int n, p;

	public static double power(int n, int p) {
		double result;
		result = Math.pow(n, p);
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Enter the value of p and n :");
			int n = sc.nextInt();
			int p = sc.nextInt();
			if (n < 0 || p < 0) {
				throw new RuntimeException("n and p cannot be negative !!1");
			}
			if (n == 0 && p == 0) {
				throw new RuntimeException("n and p cannot be zero !!1");
			}
			System.out.println("Result is " + power(n, p));
			
			

		} catch (RuntimeException e) {
			System.out.println("Error :" + e);
		}

	}

}
