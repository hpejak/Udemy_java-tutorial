package hr.pejak.lib;

import hr.pejak.enumerators.TerminatorModel;
import hr.pejak.worker.Writer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Terminator extends Machine {
    private static final Logger log = LoggerFactory.getLogger(Writer.class);

    private String serialNumber;
    private String nameHuman;
    private TerminatorModel terminatorModel;

    @Override
    public String toString() {
        return "Terminator [serialNumber=" + serialNumber + ", nameHuman=" + nameHuman + ", terminatorModel=" + terminatorModel +"]";

    }


    public void terminating(){
        log.info("Terminator is terminating");
    }


    public Terminator(){
    }

    public Terminator(String serialNumber, String nameHuman) {
        this.serialNumber = serialNumber;
        this.nameHuman = nameHuman;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Terminator)) return false;
        Terminator that = (Terminator) o;
        return serialNumber.equals(that.serialNumber) &&
                nameHuman.equals(that.nameHuman);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, nameHuman);
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
}
