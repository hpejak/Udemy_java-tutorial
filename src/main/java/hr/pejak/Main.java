package hr.pejak;

import hr.pejak.enumerators.TerminatorModel;
import hr.pejak.lib.*;
import hr.pejak.worker.Factorial;
import hr.pejak.worker.Reader;
import hr.pejak.worker.Writer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Main main = new Main();

        Terminator terminator1 = new Terminator( "T254351", "Steve");
        main.inspectAndRepairTerminator(terminator1);


        main.startTerminator();
    }



    public void startGenerics(){

        Generics testItem = new Generics();
        testItem.addToTestList("FirstItem");
        testItem.addToTestList("SecondItem");
        testItem.addToTestList("ForthItem");
        testItem.addToTestList("ThirdItem");

        List <String> sortedTestList = testItem.getTestList();

        sortedTestList.sort(new StringLengthComparator());
        log.info("String Length order is: {}",sortedTestList);

        sortedTestList.sort(String::compareTo);
        log.info("Alphabetical order of list  is: {}",sortedTestList);

        sortedTestList.sort((String s, String t1) ->
             -s.compareTo(t1)
        );
        log.info("Reverse Alphabetical order of list  is: {}",sortedTestList);

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
        Terminator terminator3 = new Terminator("Harry", "25432");
        terminator1.setTerminatorModel(TerminatorModel.T7);
        terminator2.setTerminatorModel(TerminatorModel.T7);
        terminator3.setTerminatorModel(TerminatorModel.T1);


        Generics gen = new Generics();
        gen.addToTerminatorSet(terminator1);
        gen.addToTerminatorSet(terminator2);
        log.info("Terminator set: {}", gen.getTerminatorSet());

        gen.addToTerminatorList(terminator1);
        gen.addToTerminatorList(terminator2);
        gen.addToTerminatorList(terminator3);
        List<Terminator> terminatorList = gen.getTerminatorList();
        terminatorList.sort((t1, t2) -> {
            if (t1.getSerialNumber().length() > t2.getSerialNumber().length()) {
                return 1;
            } else if (t1.getSerialNumber().length() < t2.getSerialNumber().length()) {
                return -1;
            }
            return 0;
        });
        log.info("Terminator sorted list: {}", terminatorList);

        terminatorList.sort(Comparator.comparing(Terminator::getNameHuman));
        log.info("Terminator sorted list by name: {}", terminatorList);

        String term2Model = terminator2.getTerminatorModel().getName();
        log.debug("Terminator Model is {} ", term2Model);

        terminator1.checkWeapons();

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

    public void playingWithQ (){
        Queue<Integer> queue = new ArrayBlockingQueue<>(3);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        log.info("Head of the q is: {}", queue.peek());

        queue.poll();

        for (Integer element : queue){
            log.info("Q element: {}:", element);
        }
    }
}
