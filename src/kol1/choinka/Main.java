package kol1.choinka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // choinka
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            for ( int j = 1; j < n + i; j ++){
                if (j <= n - i){
                    System.out.print(" ");
                } else if (j == n){
                    System.out.print("|");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //klepsydra
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == j || i == 1 || i == n - j + 1|| i == n){
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();

        }

        //podwojny trojkat


    }
}
