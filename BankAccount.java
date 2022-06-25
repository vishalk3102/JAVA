import java.util.*;

public class BankAccount {

    String name, address;
    int accountNumber, balance;

    BankAccount(String n, String a, int an, int b) {
        name = n;
        address = a;
        accountNumber = an;
        balance = b;
    }

    public void generateAccNumber() {
        int i = 0;
        accountNumber = 1000 + (i + 1);
        i++;
        displayInfo();
    }

    public void displayInfo() {
        System.out.println("Account details");
        System.out.println("Name :" + name);
        System.out.println("Account number :" + accountNumber);
        System.out.println("Address :" + address);
        System.out.println("Balance:" + balance);
    }

    public void deposit(int amt) {
        balance += amt;
        displayInfo();
    }

    public void withdraw(int amt) {
        balance -= amt;
        displayInfo();
    }

    public void changeAddress(String add) {
        address = add;
        displayInfo();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name :");
        String n = input.nextLine();
        System.out.println("Enter the address :");
        String a = input.nextLine();
        System.out.println("Enter the account number :");
        int an = input.nextInt();
        System.out.println("Enter the balance :");
        int b = input.nextInt();

        BankAccount obj = new BankAccount(n, a, an, b);

        System.out.println("Enter the amount you want to deposit :");
        int depoAmmount = input.nextInt();
        obj.deposit(depoAmmount);

        System.out.println("Enter the amount you want to withdraw :");
        int withAmmount = input.nextInt();
        obj.withdraw(withAmmount);

        System.out.println("Enter the new address :");
        String add = input.nextLine();
        obj.changeAddress(add);

        obj.generateAccNumber();
        obj.displayInfo();
    }
}
