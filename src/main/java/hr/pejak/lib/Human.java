package hr.pejak.lib;

import hr.pejak.interfaces.Executable;
import hr.pejak.interfaces.WordExecutable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Human {
    private static final Logger log = LoggerFactory.getLogger(Human.class);

    public void run(Executable e) {
        log.info("Start running ...");
        int distance = e.execute(12,13);
        log.info("Distance run across ... {}", distance);
    }

    public void run(WordExecutable e) {
        log.info("Start running ...");
        int distance = e.execute("RUN RUN");
        log.info("Distance run across ... {}", distance);
    }

}
