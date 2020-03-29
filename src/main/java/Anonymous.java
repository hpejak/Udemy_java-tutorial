public class Anonymous {

    Machine newMachine = new Machine(){

        @Override
        public void start(){
            System.out.println("Starting Anonymous Machine");
        }
    };


    TX tx = new TX() {
        @Override
        public void refactor() {
            System.out.println("TX is refactoring");
        }
    };


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
