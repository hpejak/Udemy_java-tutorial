package hr.pejak.enumerators;

public enum TerminatorModel {
    T1("T-1"),
    T4("T-4"),
    T7("T-7"),
    T20("T-20"),
    T70("T-70"),
    T400("T-400"),
    T500("T-500");

    private final String name;

    TerminatorModel(String name){

        this.name = name;
    }

    public String getName() {

        return name;
    }


    @Override
    public String toString() {
        return "hr.pejak.enumerators.TerminatorModel{" +
                "name='" + name + '\'' +
                '}';
    }
}
