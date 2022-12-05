package ppj5.tasks.task6;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i != 1){
            System.out.println("To się nie wyprintuje, bo najpierw sprawdzony zostanie warunek");
        }
        do {
            System.out.println("A to już tak, wykona się operacja bez sprawdzenia warunku");
            System.out.println(" :-)");
        } while (i != 1);
    }
}
