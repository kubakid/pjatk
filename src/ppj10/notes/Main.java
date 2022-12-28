package ppj10.notes;

public class Main {
    public static void main(String[] args) {
        Przyklad przyklad = new Przyklad("Kuna", 1800);
        System.out.println(przyklad.whoAreYou());

        Student student = new Student("Jan", 2000, 10000);
        System.out.println(student.whoAreYou());
    }

}
