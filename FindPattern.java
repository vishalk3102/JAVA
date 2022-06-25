import java.util.Scanner;

public class FindPattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = input.nextLine();

        int count = 0;
        char ch = str.charAt(0);
        int i = 1;
        while (i < str.length()) {
            if (str.charAt(i) == '1' && ch == '0') {
                while (str.charAt(i) == '1') {
                    i++;
                }
                if (str.charAt(i) == '0') {
                    count++;
                }
            }
            ch = str.charAt(i);
            i++;
        }

        System.out.println("Count : " + count);
    }
}
