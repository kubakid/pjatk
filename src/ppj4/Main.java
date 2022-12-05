package ppj4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //zad 1
        boolean andTx2 = true && true;
        boolean andTx1 = true && false;
        boolean andTx0 = false && false;

        boolean orTx2 = true || true;
        boolean orTx1 = true || false;
        boolean orTx0 = false || false;

        System.out.println("true and true = " + andTx2);
        System.out.println("true and false = " + andTx1);
        System.out.println("false and false = " + andTx0);
        System.out.println("true or true = " + orTx2);
        System.out.println("true or false = " + orTx1);
        System.out.println("false or false = " + orTx0);


        //zad 2

        double liczba = 15;
        boolean isPrime = true;
        for(int i = 2; Math.sqrt(liczba) >= i ; i++){
            if (liczba % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Jest pierwsza");
        } else{
            System.out.println("nie jest pierwsza");
        }

        //zad 3

        boolean czyPada = true;
        if (czyPada){
            System.out.println("Pada");
        } else {
            System.out.println("Nie pada");
        }

        // zad 4

        int zmienna;
        czyPada = false;
        if (czyPada){
            zmienna = 5;
        } else{
            zmienna = 8;
        }

        // zad 5

        czyPada = true;
        boolean czySwieciSlonce = false;
        if (czyPada && !czySwieciSlonce){
            System.out.println("Plucha");
        } else if (czyPada && czySwieciSlonce) {
            System.out.println("tęcza");
        } else if (!czyPada && czySwieciSlonce) {
            System.out.println("Słonecznie");
        } else {
            System.out.println("Pochmurno");
        }

        // zad 6

        // wyprintuje
        //Hello PPJ

        // zad 7
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
