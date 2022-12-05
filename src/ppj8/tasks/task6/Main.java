package ppj8.tasks.task6;

public class Main {
    public static void main(String[] args) {
        int wrt = 5;
        System.out.println(wrt);

        System.out.println();
        System.out.println();

        modifyValue(wrt);

        System.out.println();
        System.out.println();

        System.out.println(wrt);
    }

    public static void modifyValue(int a){
        System.out.println(a);
        a *= 5;
        System.out.println(a);
    }
    //dzieje sie tak dlatego, że metoda zwiększa 5ciokrotnie wartość zmiennej wewnątrz wyłącznie niej i potem nie
    // przypisuje do wartosci zmiennej globalnej
}
