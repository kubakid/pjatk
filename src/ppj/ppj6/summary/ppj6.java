package ppj.ppj6.summary;

import java.util.Scanner;

public class ppj6 {
    public static void main(String[] args) {

        // zad 1

        for (char c = 75; c <= 150; c++){
            System.out.println(c + " - " + (int)c);

        }

        // zad 2

        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();

        int []nominaly = {500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int val = (int) (value * 100);
        for (int j : nominaly) {
            if (val >= j) {
                int a = val / j;
                val -= j * a;
                if (a > 0) {
                    if (j >= 100) {
                        System.out.println(a + " * " + j / 100 + " zl");
                    } else {
                        System.out.println(a + " * " + j + " gr");
                    }
                }
            }
        }

        // zad 3
        byte liczba = scanner.nextByte();
        System.out.println(Integer.toString(liczba, 16));

        // zad 4

        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 2; j <= 4; j++){
                System.out.print((int)Math.pow(i , j) + " ");
            }
            System.out.println(" ");
        }

        // zad 5

        int size = scanner.nextInt();
        int kropki = size;
        int gwiazdki = 1;
        int counter = 1;

        for (int i = 0; i < 2 * size + 1; i++) {
            for (int j = 0; j < kropki; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < gwiazdki; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < kropki; j++) {
                System.out.print(".");
            }
            System.out.println();
            counter++;
            if (counter <= size + 1) {
                kropki--;
                gwiazdki += 2;
            } else {
                kropki++;
                gwiazdki -= 2;
            }
        }

        // zad 6

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
