import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Reader {

    private static String fileName = "C:\\Users\\Hrvoje\\Desktop\\TEST1.txt";
    private static File textFilte = new File(fileName);
    private static ClassLoader classloader = Thread.currentThread().getContextClassLoader();
//   InputStream textFilte = classloader.getResourceAsStream("test.csv");

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

    public void fileReader() {

        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
