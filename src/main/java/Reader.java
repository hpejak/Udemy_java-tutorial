import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

    private static String fileName = "C:\\Users\\Hrvoje\\Desktop\\TEST1.txt";
    private static File textFilte = new File(fileName);


public void readFile(){
    Scanner scanner;


        try {
            scanner = new Scanner(textFilte);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
