package hr.pejak.lib;

import hr.pejak.enumerators.TerminatorModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Terminator extends Machine implements Comparable<Terminator>{
    private static final Logger log = LoggerFactory.getLogger(Terminator.class);

    private String serialNumber;
    private String nameHuman;
    private TerminatorModel terminatorModel;
    private Weapons weapons = new Weapons();

    public Terminator(){
    }

    public Terminator( String nameHuman, String serialNumber) {
        this.serialNumber = serialNumber;
        this.nameHuman = nameHuman;
    }

    @Override
    public String toString() {
        return "Terminator [serialNumber=" + serialNumber + ", nameHuman=" + nameHuman + ", terminatorModel=" + terminatorModel +"]";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Terminator)) return false;
        Terminator that = (Terminator) o;
        return serialNumber.equals(that.serialNumber) &&
                nameHuman.equals(that.nameHuman) &&
                terminatorModel == that.terminatorModel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, nameHuman, terminatorModel);
    }

    @Override
    public int compareTo(Terminator terminator) {
        return nameHuman.compareTo(terminator.nameHuman);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNameHuman() {
        return nameHuman;
    }

    public void setNameHuman(String nameHuman) {
        this.nameHuman = nameHuman;
    }

    public TerminatorModel getTerminatorModel() {
        return terminatorModel;
    }

    public void setTerminatorModel(TerminatorModel terminatorModel) {
        this.terminatorModel = terminatorModel;
    }

    public void terminating(){
        log.info("Terminator is terminating");
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void checkWeapons(){
        for (String weapon: weapons){
            log.info("It has {}", weapon);
        }
    }
}
