package ppj5;

import java.util.Scanner;

public class ppj5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // zad 1

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && c + b > a) {
            System.out.println("Może istnieć");
            if (a * a + b * b > c * c && a * a + c * c > b * b && c * c + b * b > a * a) {
                System.out.println("Trójkąt jest ostrokątny");
            } else
                System.out.println("Trójkąt nie jest prostokątny");
        } else {
            System.out.println("Nie może istnieć");
        }


        // zad 2
        float d = scanner.nextFloat();
        float e = scanner.nextFloat();
        float f = scanner.nextFloat();
        float delta = e * e - 4 * d * f;
        if (delta < 0) {
            System.out.println("Brak miejsc zerowych");
        } else if (delta == 0) {
            System.out.println("Xo =" + (-e / 2 * d));
        } else {
            System.out.println("X1 = " + ((-e + Math.sqrt(delta)) / 2 * d));
            System.out.println("X2 = " + ((-e - Math.sqrt(delta)) / 2 * d));
        }


        // zad 3
        float min = scanner.nextFloat();
        double max = scanner.nextFloat();
        if (min / max >= 0.875) {
            System.out.println("Ocena: 5");
        } else if (min / max >= 0.8125) {
            System.out.println("Ocena: 4.5");
        } else if (min / max >= 0.75) {
            System.out.println("Ocena: 4");
        } else if (min / max >= 0.626) {
            System.out.println("Ocena 3.5");
        } else if (min / max >= 0.5) {
            System.out.println("Ocena: 3");
        } else {
            System.out.println("brak zaliczenia");
        }

        // 15 na 45 = brak zaliczenia
        // 5 na 8 : ocena: 3
        //3 na 5,5 : ocena: 3
        // 40 na 45 : ocena : 5


        // zad 4

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }


        // zad 5


        int wrt = 2;
        for (int i = 1; i < 11; i++) {
            System.out.println(i * wrt);
        }

        // zad 6


        int i = 1;
        while (i != 1) {
            System.out.println("To się nie wyprintuje, bo najpierw sprawdzony zostanie warunek");
        }
        do {
            System.out.println("A to już tak, wykona się operacja bez sprawdzenia warunku");
            System.out.println(" :-)");
        } while (i != 1);


        // zad 7

        int liczby = 0;
        int suma = 0;
        int h = scanner.nextInt();
        while (h != 0) {
            liczby++;
            suma += h;
            h = scanner.nextInt();
        }
        System.out.println("Ilość wprowadzonych liczb: " + liczby);
        System.out.println("Suma wprowadzonych liczb: " + suma);


        // zad 8

        for (double zz = 0; zz < 10; zz++) {
            System.out.println(1. / Math.pow(2., i));
        }


        // zad 9

        int month = 12;
        int day = 5;
        int year = 2022;

        int daysFromStartOfTheYear = day;
        for (int ii = 1; ii < month; ii++) {
            switch (ii) {
                case 1, 3, 5, 7, 8, 10, 12 -> daysFromStartOfTheYear += 31;
                case 2 -> {
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        daysFromStartOfTheYear = 29;
                    } else {
                        daysFromStartOfTheYear += 28;
                    }
                }
                default -> daysFromStartOfTheYear += 30;
            }
        }
        System.out.println("days = " + daysFromStartOfTheYear);


        // zad 10


        int k = 1;
        for (int y = 1; y < 7; y++) {
            for (int x = 1; x < 10; x++) {
                if (k == 1) {
                    System.out.print("*");
                    k = 0;
                } else {
                    System.out.print(" ");
                    k = 1;
                }


            }
        }
    }
}