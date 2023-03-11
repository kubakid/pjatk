package ppj.ppj10.notes;

public class Student extends Przyklad {
    protected int sNumber;

    protected Student(String name, int birthYear, int sNumber){
        super(name, birthYear);
        this.sNumber = sNumber;
    }

    public String whoAreYou(){
        return "Student("+sNumber+")";
    }
}
