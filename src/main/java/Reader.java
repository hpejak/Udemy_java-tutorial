import java.io.*;
import java.util.Scanner;

public class Reader {

    private static String fileName = "C:\\Users\\Hrvoje\\Desktop\\TEST1.txt";
    private static File textFile = new File(fileName);
    private static String localFileName = "src/fileTest.txt";
    private static File localFile = new File(localFileName);

public void readFile(){
    Scanner scanner;
        try {
            scanner = new Scanner(textFile);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File "+ fileName + " dose not exist");
        }


    }

    public void fileReader() {


        try {
            FileReader reader = new FileReader(localFile);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while( (line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File "+ localFileName + " dose not exist");
        } catch (IOException e) {
            System.out.println("Unable to read file " + localFileName);
        }

        finally {
            System.out.println("End of reading");
        }
    }
}
