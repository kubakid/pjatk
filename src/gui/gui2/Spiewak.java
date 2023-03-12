package gui.gui2;


public abstract class Spiewak {
    private String surname;
    private int number;
    static int counter = 1;

    public Spiewak(String surname) {
        this.surname = surname;
        this.number = counter;
        counter++;
    }

    public abstract String spiewaj();


}
