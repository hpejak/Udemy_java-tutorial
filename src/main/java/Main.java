
public class Main {

    public static void main(String[] args) {


        Generics testItem = new Generics();

        testItem.addToTestList("FirstItem");
        testItem.addToTestList("SecondItem");
        testItem.showTestList();

        testItem.addToHashMap(1, "Jack");
        testItem.addToHashMap(2, "John");
        System.out.println(testItem.getTestHashMap());


        testItem.addToMachineList(new Machine());
        testItem.addToMachineList(new Machine());
        testItem.showMachines();

        testItem.addToTerminatorList(new Terminator());
        testItem.addToTerminatorList(new Terminator());
        testItem.showList(testItem.getTerminatorList());


        Anonymous anonymous = new Anonymous();
        anonymous.getNewMachine().start();
        anonymous.getTx().refactor();


        Reader reader = new Reader();
        reader.readFile();
        reader.fileReader();

        ExceptionTest newTest =  new ExceptionTest();

        try {
            newTest.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        newTest.calculate(0);

        Terminator terminator = new Terminator();
        terminator.run();

        Writer writer = new Writer();
        writer.fileWrite();

    }
}
