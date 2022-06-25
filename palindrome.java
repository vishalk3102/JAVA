import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class palindrome {

	public static boolean checkpalin(String s) {
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		if (sb.toString().equals(s)) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		File fp = new File("mytext.txt");
		FileWriter fw = null;
		int ctr = 0;

		try {
			fp.createNewFile();
			System.out.println("Enter the data to write in file");
			String str = input.nextLine();
			fw = new FileWriter("mytext.txt");
			fw.write(str);
			fw.close();

			Scanner sc = new Scanner(fp);
			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				String[] arr = s.split(" ");
				for (int i = 0; i < arr.length; i++) {
					if (checkpalin(arr[i])) {
						ctr++;
					}
				}

			}

			System.out.println("The number of palindrome in file is :" + ctr);

		} catch (IOException e) {
			System.out.println("error has occurred");
		}

	}

}
