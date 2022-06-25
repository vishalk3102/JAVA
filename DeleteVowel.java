
import java.util.Scanner;

public class DeleteVowel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.nextLine();
        StringBuffer sb = new StringBuffer(str);

        int i = 0;
        while (i < sb.length()) {
            if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o'
                    || sb.charAt(i) == 'u' || sb.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                sb.replace(i, i + 1, "");
            }
            i++;
        }
        System.out.println("The final string is : " + sb);
    }

}
