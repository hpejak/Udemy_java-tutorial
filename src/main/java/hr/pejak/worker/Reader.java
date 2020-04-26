package hr.pejak.worker;

import hr.pejak.lib.Robot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    private static final String FILE_NAME = "C:\\Users\\Hrvoje\\Desktop\\TEST1.txt";
    private static final File TEXT_FILE = new File(FILE_NAME);
    private static final String LOCAL_FILE_NAME = "src/fileTest.txt";
    private static final File LOCAL_FILE = new File(LOCAL_FILE_NAME);
    private static final Logger log = LoggerFactory.getLogger(Reader.class);
    private static final String ROBOT_FILE_NAME = "src/robotS.txt";
    private static final String ROBOT_FILE_NAME_LIST = "src/robotSList.txt";

public void readFile(){
    Scanner scanner;
        try {
            scanner = new Scanner(TEXT_FILE);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                log.info(line);
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            log.error("File "+ FILE_NAME + " dose not exist");
        }

    }

    public void fileReader() {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(LOCAL_FILE))) {

            String line;

            while( (line = bufferedReader.readLine()) != null) {
                log.info(line);
            }

        } catch (FileNotFoundException e) {
            log.warn("File "+ LOCAL_FILE_NAME + " dose not exist");
        } catch (IOException e) {
            log.warn("Unable to read file " + LOCAL_FILE_NAME);
        }
        finally {
            log.debug("End of reading");
        }
    }

    public void robotDeserializer() {
        log.debug("Reading Robot data ...");

        try (ObjectInputStream os = new ObjectInputStream(new FileInputStream(ROBOT_FILE_NAME))) {

            int count = os.readInt();

            for (int i = 0; i < count; i++){
                Robot robot = (Robot) os.readObject();
                log.info("Read robot is: {}",robot);
            }

            log.debug("Robot data reading is Finished");
        } catch (FileNotFoundException e) {
            log.warn("File {} not Found", ROBOT_FILE_NAME);
        } catch (IOException e) {
            log.warn("File {}  Reading Problem",ROBOT_FILE_NAME);
            log.debug("Deserialization problem : {}", (Object) e.getStackTrace());
        } catch (ClassNotFoundException e) {
            log.warn("No Robots where found");
        }
    }


    public void robotListReader(){
        log.debug("Reading Robot List data");

        try(ObjectInputStream os = new ObjectInputStream(new FileInputStream(ROBOT_FILE_NAME_LIST))){

            @SuppressWarnings("unchecked")
            ArrayList<Robot> robots = (ArrayList<Robot>) os.readObject();

            for(Robot robot : robots){
                log.info("Read robot is {} ", robot);
            }

        } catch (FileNotFoundException e){
            log.warn("File not Found");
        } catch (IOException e) {
            log.warn("File Reading Problem");
        } catch (ClassNotFoundException e) {
            log.warn("No Robots where found");
        }

    }
}
