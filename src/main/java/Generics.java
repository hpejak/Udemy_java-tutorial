import java.util.ArrayList;
import java.util.HashMap;


public class Generics {

    ArrayList<String> testList = new ArrayList<>();
    ArrayList<Machine> machineList = new ArrayList<>();
    ArrayList<Terminator> terminatorList = new ArrayList<>();

    HashMap<Integer,String> testHashMap = new HashMap<>();



    public void addToMachineList(Machine machine){
        this.machineList.add(machine);
    }

    public void addToTerminatorList(Terminator terminator){
        this.terminatorList.add(terminator);
    }

    public void showMachines(){
        for (Machine value: this.machineList){
            System.out.println(value);
        }
    }

    public void showTerminators(){
        for (Machine value: this.terminatorList){
            System.out.println(value);
        }
    }

    public void showTestList(){

        for(String value: this.testList){
            System.out.println(value);
        }
    }

    public void showList(ArrayList<? extends Machine> list){

        for(Machine value: list){
            System.out.println(value);
            value.start();
        }
    }

    public void addToTestList(String testItem) {
        this.testList.add(testItem);
    }

    public void addToHashMap(Integer key, String value){
        this.testHashMap.put(key,value);
    }

    public ArrayList<String> getTestList() {
        return testList;
    }

    public ArrayList<Machine> getMachineList() {
        return machineList;
    }

    public ArrayList<Terminator> getTerminatorList() {
        return terminatorList;
    }

    public void setTestList(ArrayList<String> testList) {
        this.testList = testList;
    }

    public HashMap<Integer, String> getTestHashMap() {
        return testHashMap;
    }

    public void setTestHashMap(HashMap<Integer, String> testHashMap) {
        this.testHashMap = testHashMap;
    }
}
