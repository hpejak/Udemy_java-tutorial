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

        Reader reader = new Reader();
        reader.readFile();
    }
}
