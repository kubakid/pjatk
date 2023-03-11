package ppj.ppj5.tasks.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczby = 0;
        int suma = 0;
        int a = scanner.nextInt();
        while (a != 0){
            liczby++;
            suma += a;
            a = scanner.nextInt();
        }
        System.out.println("Ilość wprowadzonych liczb: " + liczby);
        System.out.println("Suma wprowadzonych liczb: "+ suma);

    }
}
