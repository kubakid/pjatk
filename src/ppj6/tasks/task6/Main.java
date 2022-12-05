package ppj6.tasks.task6;

public class Main {
    public static void main(String[] args) {
        double [] tab = new double[10];
        System.out.println("\n\n Part 1 \n");

        for (int i = 0; i < tab.length; i++) {
            int min = 5;
            int max = 10;
            tab[i] = (int) (Math.random() * (max - min + 1) + min);
        }

        System.out.println("\n\n Part 2 \n");

        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);

        }

        System.out.println("\n\n Part 3 \n");

        for (int i = 0; i < tab.length; i+=2){
            System.out.println(tab[i]);

        }

        System.out.println("\n\n Part 4 \n");

        for (int i = 0; i < tab.length ; i++){
            int j = (int) tab[i];
            if (j % 2 == 1){
                System.out.println(j);
            }
        }
    }
}
