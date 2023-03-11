package ppj.ppj6.tasks.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
    }


}
