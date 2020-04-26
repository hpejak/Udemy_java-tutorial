package hr.pejak.lib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Generics {

    private static final Logger log = LoggerFactory.getLogger(Generics.class);

    List<String> testList = new ArrayList<>();
    List<Machine> machineList = new ArrayList<>();
    ArrayList<Terminator> terminatorList = new ArrayList<>();

    Map<Integer,String> testHashMap = new HashMap<>();



    public void addToMachineList(Machine machine){
        this.machineList.add(machine);
    }

    public void addToTerminatorList(Terminator terminator){
        this.terminatorList.add(terminator);
    }

    public void showMachines(){
        for (Machine value: this.machineList){
            log.info("Machine: {}",value);
        }
    }

    public void showTerminators(){
        for (Machine value: this.terminatorList){
            log.info("Terminator: {}",value);
        }
    }

    public void showTestList(){

        for(String value: this.testList){
            log.info("Lists: {}",value);
        }
    }

    public void showList(List<? extends Machine> list){

        for(Machine value: list){
            log.info("Machines: {}",value);
            value.start();
        }
    }

    public void addToTestList(String testItem) {
        this.testList.add(testItem);
    }

    public void addToHashMap(Integer key, String value){
        this.testHashMap.put(key,value);
    }

    public List<String> getTestList() {
        return testList;
    }

    public List<Machine> getMachineList() {
        return machineList;
    }

    public List<Terminator> getTerminatorList() {
        return terminatorList;
    }

    public void setTestList(List<String> testList) {
        this.testList = testList;
    }

    public Map<Integer, String> getTestHashMap() {
        return testHashMap;
    }

    public void setTestHashMap(Map<Integer, String> testHashMap) {
        this.testHashMap = testHashMap;
    }
}


