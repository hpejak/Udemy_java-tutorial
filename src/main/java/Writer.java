import java.io.*;

public class Writer {

    public void fileWrite(){

        String localFileName = "src/fileTest.txt";
        File file = new File(localFileName);

        try (FileWriter writer = new FileWriter(new File(localFileName))){

            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("This is insert in line\n");
            bufferedWriter.write("This is additional text\n");
            bufferedWriter.newLine();
            bufferedWriter.write("THE END");
            bufferedWriter.flush();

        } catch (IOException e) {
            System.out.println("File " + localFileName + " not found" );
        }



    }

}
