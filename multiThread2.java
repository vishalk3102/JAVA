import java.util.*;

class factorial implements Runnable {

	private int num1;
	private int num2;

	public factorial(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}

	public int fact(int n) {
		if (n == 0) {
			return 1;
		}

		return n * fact(n - 1);

	}

	public void run() {

		for (int i = num1; i <= num2; i++) {
			System.out.println("factorial of " + i + " is " + fact(i));
		}
	}
}

class alphabets implements Runnable {

	private int num1;
	private int num2;

	public alphabets(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}

	public void run() {
		for (int i = num1; i <= num2; i++) {
			System.out.println(i + " :" + (char) (i + 64));
		}

	}
}

public class multiThread2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		alphabets r1 = new alphabets(n1, n2);
		Thread t1 = new Thread(r1);

		factorial r2 = new factorial(n1, n2);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
