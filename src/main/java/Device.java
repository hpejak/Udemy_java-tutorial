public abstract class Device{
    private String sn;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public abstract void start();


    public void run(){
        start();
    };
}
