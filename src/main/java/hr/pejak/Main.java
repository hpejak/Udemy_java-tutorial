package hr.pejak;

import hr.pejak.enumerators.TerminatorModel;
import hr.pejak.lib.Anonymous;
import hr.pejak.lib.Generics;
import hr.pejak.lib.Machine;
import hr.pejak.lib.Robot;
import hr.pejak.lib.Terminator;
import hr.pejak.worker.Factorial;
import hr.pejak.worker.Reader;
import hr.pejak.worker.Writer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Main main = new Main();

        Terminator terminator1 = new Terminator( "T254351", "Steve");
        main.inspectAndRepairTerminator(terminator1);

        log.info("Terminator data Final {}", terminator1);
    }



    public void startGenerics(){

        Generics testItem = new Generics();
        testItem.addToTestList("FirstItem");
        testItem.addToTestList("SecondItem");
        testItem.showTestList();

        testItem.addToHashMap(1, "Jack");
        testItem.addToHashMap(2, "John");

        testItem.addToMachineList(new Machine());
        testItem.addToMachineList(new Machine());
        testItem.showMachines();

        testItem.addToTerminatorList(new Terminator());
        testItem.addToTerminatorList(new Terminator());
        testItem.showList(testItem.getTerminatorList());

    }

    public void startAnonymous(){
        Anonymous anonymous = new Anonymous();
        anonymous.getNewMachine().start();
        anonymous.getTx().refactor();
    }

    public void startTerminator(){
        Terminator terminator = new Terminator();
        terminator.run();

        Terminator terminator1 = new Terminator("John", "254351");
        Terminator terminator2 = new Terminator("John", "254351");
        terminator1.setTerminatorModel(TerminatorModel.T1);
        terminator1.setTerminatorModel(TerminatorModel.T20);
        terminator2.setTerminatorModel(TerminatorModel.T7);

        String term2Model = terminator2.getTerminatorModel().getName();
        log.debug("Terminator Model is {} ", term2Model);

        switch (terminator1.getTerminatorModel()){
            case T1:
                log.info("No Worry");
                break;
            case T4:
                log.info("Little Worry");
                break;
            case T7:
                log.info("Be Afraid");
                break;
            default:
                log.info("No Known Terminator");
                break;
        }
    }

    public void startFileTests(){
        Reader reader = new Reader();
        reader.readFile();
        reader.fileReader();

        Writer writer = new Writer();
        writer.fileWrite();
    }

    public void startSerializationTests(){
        Writer writer = new Writer();
        Reader reader = new Reader();

        Robot eraser = new Robot(130, "Eraser");
        Robot cleaner = new Robot(155, "Cleaner");
        Robot.setCount(1);
        eraser.setKills(2);

        Robot[] robots = {eraser,cleaner};

        writer.robotSerializer(robots);

        reader.robotDeserializer();
    }

    public void startFactorial(){

        Factorial factorial = new Factorial();
        String factor = String.valueOf(factorial.calculate(2));
        log.info(factor);
    }

    public void inspectAndRepairTerminator(Terminator terminator){

        log.info("Terminator data are {}", terminator);
        terminator.setNameHuman("John");

    }
}
