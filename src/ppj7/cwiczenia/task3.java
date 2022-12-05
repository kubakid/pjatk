package ppj7.cwiczenia;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        char[] tabb = new char[5];
        for (int i = 0; i < tabb.length; i ++){
            tabb[i] = (char)(Math.random() * (90 - 65) + 65);
            System.out.println(tabb[i]);
        }
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        while (a != 0){
            char letter = scanner.next().charAt(0);
            for (int i = 0; i < tabb.length; i++){
                if (letter == tabb[i]){
                    tabb[i] = 0;
                    a--;
                }
            }
        }
    }
}
