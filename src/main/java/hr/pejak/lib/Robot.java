package hr.pejak.lib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public class Robot implements Serializable {

    private static final Logger log = LoggerFactory.getLogger(Robot.class);

    private int id;
    private String mark;
    private transient int kills;
    private static int count;

    private class MicroChip {
        public void calculate() {
            log.info("Robot {} calculates", id);
        }
    }

    public Robot(){

    }

    public Robot(int id, String mark) {
        this.id = id;
        this.mark = mark;
        kills = 0;
    }

    public void start() {
        log.info("Starting robot with id {}", id);
        MicroChip microChip = new MicroChip();
        microChip.calculate();
    }

    public int getKills() {
        return kills;
    }


    public void setKills(int kills) {
        this.kills = kills;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Robot.count = count;
    }

    @Override
    public String toString() {
        return "Robot [id=" + id + ", mark=" + mark + ", kills=" + kills +", robotCount=" + count +"]";
    }
}
