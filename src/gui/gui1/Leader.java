package gui.gui1;

public class Leader extends Hero{

    private String name;
    private int age;

    public Leader(String name, int age){
        super(name,age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
