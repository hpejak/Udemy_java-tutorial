package hr.pejak.lib;

import hr.pejak.interfaces.TX;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Anonymous {
    private static final Logger log = LoggerFactory.getLogger(Anonymous.class);

    Machine newMachine = new Machine(){

        @Override
        public void start(){
            log.info("Starting Anonymous Machine");
        }
    };


    TX tx = () -> log.info("TX is refactoring");


    public Machine getNewMachine() {
        return newMachine;
    }

    public void setNewMachine(Machine newMachine) {
        this.newMachine = newMachine;
    }

    public TX getTx() {
        return tx;
    }

    public void setTx(TX tx) {
        this.tx = tx;
    }
}
