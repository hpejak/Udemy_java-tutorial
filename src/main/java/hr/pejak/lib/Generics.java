package hr.pejak.lib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;


public class Generics {

    private static final Logger log = LoggerFactory.getLogger(Generics.class);

    List<String> testList = new ArrayList<>();
    List<Machine> machineList = new ArrayList<>();
    List<Terminator> terminatorList = new LinkedList<>();
    Map<Integer,String> testHashMap = new HashMap<>();
    Set<String> testSet = new HashSet<>();
    Set<Terminator> terminatorSet = new HashSet<>();



    public void addToMachineList(Machine machine){
        this.machineList.add(machine);
    }

    public void addToTerminatorList(Terminator terminator){
        this.terminatorList.add(terminator);
    }

    public void addToTerminatorSet(Terminator value){
        this.terminatorSet.add(value);
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

    public void addToTestSet(String value){
        this.testSet.add(value);
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

    public Set<Terminator> getTerminatorSet() {
        return terminatorSet;
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


