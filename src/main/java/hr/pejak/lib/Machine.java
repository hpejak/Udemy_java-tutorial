package hr.pejak.lib;

import hr.pejak.abstracts.Device;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Machine extends Device {
    private static final Logger log = LoggerFactory.getLogger(Machine.class);

    @Override
    public String toString() {

        return "I am Machine";
    }

    @Override
    public void start(){

        log.info("Machine is booting");
    }

}
