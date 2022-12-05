package ppj5.tasks.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
    }
}
