import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) {

        // creating a file
        File fp = new File("filehandling.txt");
        try {
            fp.createNewFile();
            System.out.println("File created succesffuly");
        } catch (IOException e) {
            System.out.print("File not created .");
            e.printStackTrace();
        }

        // writing to a file
        try {
            FileWriter fw = new FileWriter("fileHandling.txt");
            fw.write("This is file handling file created to practice file handling in java");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File fr = new File("fileHandling.txt");

        try {
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File cannot be read");
        }

        File fd = new File("fileHandling.txt");
        if (fd.delete()) {
            System.out.println("File deleted " + fd.getName());
        } else {

            System.out.println("error occured whike deleting the file");
        }

    }
}
