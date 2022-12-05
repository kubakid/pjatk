package ppj5.tasks.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c  && a + c > b && c + b > a){
            System.out.println("Może istnieć");
            if ( a*a + b*b > c*c  && a*a + c*c > b*b && c*c + b*b > a*a){
                System.out.println("Trójkąt jest ostrokątny");
            } else
                System.out.println("Trójkąt nie jest prostokątny");
        } else{
            System.out.println("Nie może istnieć");
        }

    }
}
