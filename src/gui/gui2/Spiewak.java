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

    @Override
    public String toString() {
        return "Spiewak{" +
                "surname='" + surname + '\'' +
                ", number=" + number +
                '}';
    }

    public static Spiewak najglosniej(Spiewak[] a){
        Spiewak max = a[0];
        int maxVal = 0;
        for (Spiewak person: a) {
            int counter = 0;
            char[] tab = person.spiewaj().toCharArray();
            for (char b : tab){
                if (b >= 'A' && b <= 'Z')
                    counter++;
            }
            if (counter > maxVal){
                maxVal = counter;
                max = person;
            }
        }
        return max;
    }
}
