package ppj6.tasks.task5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
    }
}