package ppj.ppj4.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 > 0 && num2 > 0){
            System.out.println(num1 + num2);
        } else {
            System.out.println(num1 - num2);
        }
    }
}