package hr.pejak.lib;

import hr.pejak.abstracts.Device;

public class Machine extends Device {

    @Override
    public String toString() {

        return "I am Machine";
    }

    @Override
    public void start(){

        System.out.println("Machine is booting");
    }

}
