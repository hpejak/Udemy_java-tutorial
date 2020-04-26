package hr.pejak.worker;

import hr.pejak.lib.Robot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Writer {
    Logger log = LoggerFactory.getLogger(Writer.class);
    private static final String LOCAL_FILE_NAME = "src/fileTest.txt";
    private static final String ROBOT_FILE_NAME_LIST = "src/robotSList.txt";
    private static final String ROBOT_FILE_NAME = "src/robotS.txt";

    public void fileWrite(){

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(LOCAL_FILE_NAME)))){

            bufferedWriter.write("This is insert in line\n");
            bufferedWriter.write("This is additional text\n");
            bufferedWriter.newLine();
            bufferedWriter.write("THE END");
            bufferedWriter.flush();

        } catch (IOException e) {
            log.error("File {} not found",LOCAL_FILE_NAME );
        }

    }


    public void robotSerializer(Robot[] robots) {
        log.debug("Serializing Robot Data");

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(ROBOT_FILE_NAME))) {

            os.writeInt(robots.length);

            for (Robot robot : robots) {
                os.writeObject(robot);
            }

            log.debug("Finished serializing Robot");
        } catch (FileNotFoundException e) {
            log.warn("File {} Not Found", ROBOT_FILE_NAME);
        } catch (IOException e) {
            log.warn("Can write in file because: {}", (Object) e.getStackTrace());
        }
    }


    public void robotSerializerList(Robot[] robots){

        ArrayList<Robot> robotList = new ArrayList<>(Arrays.asList(robots));

        log.debug("Serializing Robot List Data");
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(ROBOT_FILE_NAME_LIST))){

            os.writeObject(robotList);

            log.debug("Finished serializing Robots");
        } catch (FileNotFoundException e){
            log.warn("File {} Not Found", ROBOT_FILE_NAME_LIST);
        } catch (IOException e){
            log.warn("Can write in file because: {}", (Object) e.getStackTrace());
        }
    }

}
