package ppj11.wyklad.tasks;

public class Welder extends Person {

    private int seniority;

    public Welder(int seniority) {
        this.seniority = seniority;
    }

    public Welder(String name, int seniority) {
        super(name);
        this.seniority = seniority;
    }

    @Override
    public void wyswietl() {
        super.wyswietl();
        System.out.println(", seniority: " + seniority);
    }
}
