package ppj6.tasks.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 2; j <= 4; j++){
                System.out.print((int)Math.pow(i , j) + " ");
            }
            System.out.println(" ");
        }
    }
}
