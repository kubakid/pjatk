package ppj.ppj10.notes;

public class Przyklad {

    protected String name;
    protected int birthYear;

    public Przyklad(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public Przyklad(){
        this("Noname", 9999);
    }

    public String whoAreYou(){
        return "Person";
    }
}
