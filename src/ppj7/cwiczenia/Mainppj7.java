package ppj7.cwiczenia;

import java.util.Scanner;

public class Mainppj7 {
    public static void main(String[] args) {
        //task 1

        //1
        double[] tab = new double[10];
        System.out.println("zawartosc tablicy:");
        System.out.print("[");
        for (int i = 0; i < tab.length;i++){
            tab[i] = Math.random() * 10;
            //2
            if (i < tab.length - 1)
                System.out.print(tab[i]+", ");
            else
                System.out.print(tab[i]);
        }
        System.out.print("]");
        System.out.println();

        //3
        System.out.println("liczby o parzystych indeksach:");
        for (int i = 0; i< tab.length; i++){
            if (i % 2 == 0){
                System.out.println(tab[i]);
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Nieparzyste wartości po konwersji na inta");
        for (int i = 0; i <  tab.length; i ++){
            int a = (int) tab[i];
            if (a % 2 == 1){
                System.out.println(tab[i]);
            }
        }

        // task 2

        char[] taba = new char[3];
        int minVal = 65535;
        int minInd = 4;
        for (int i = 0 ; i < taba.length; i ++){
            taba[i] = (char)(Math.random() * 65535);
            System.out.println(taba[i]);
            int a = (int)taba[i];
            if (a < minVal){
                minVal = a;
                minInd = i;
            }

        }
        System.out.println(minInd);

        //task 3

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

        // task 4

        int[] arr = {153, 333, 370, 515,407,80};
        for (int i = 0; i< arr.length; i ++) {
            int liczba = arr[i];
            int sum = 0;
            int potega = 0;
            while (liczba != 0){
                potega++;
                liczba /= 10;
            }
            liczba = arr[i];
            while (liczba != 0) {
                int num = liczba % 10;
                liczba /= 10;
                sum += Math.pow(num, potega);
            }
            if ( arr[i] == sum){
                System.out.println(arr[i]);
            }
        }

        // task 5

        int size = (int)(Math.random() * (15-10) + 10);
        int[] tabc = new int[size];
        //1
        for ( int i = 0 ; i< tabc.length; i ++){
            tabc[i] = i;
        }
        int[] mixedTab = new int[size];
        for (int i = 0; i < size; i++){
            int random = (int)(Math.random() * (size-1));
            a = tabc[i];
            tabc[i] = tabc[random];
            tabc[random] = a;
        }

        for(int i = 0; i< tabc.length; i++){
            System.out.print(tabc[i] + " ");
        }
        System.out.println( );

        for(int i = 0; i< tabc.length; i++){
            for (int j = 0; j < tabc.length; j++){
                if (tabc[j] == i){
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }

        // task 6

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for (int i = 0; i < arr1.length; i ++){
            arr1[i] = (int)(Math.random() * (100 - 1) + 1);
            arr2[i] = (int)(Math.random() * (100 - 1) + 1);
        }
        int[] arr12 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i ++){
            arr12[i] = arr1[i];
            arr12[i+5] = arr2[i];
        }


        int val = 1;
        int[] unique = {arr1[0]};
        int[] helpUni = {arr1[0]};
        for (int i = 0; i < arr1.length; i++){
            boolean isUni = true;
            for(int j = 0; j < unique.length; j++){
                if (arr1[i] == unique[j]){
                    isUni = false;
                    break;
                }
            }
            if (isUni){
                val += 1;
                helpUni = new int[val];
                for (int j = 0; j < unique.length; j++){
                    helpUni[j] = unique[j];
                }
                helpUni[val-1] = arr1[i];
                unique = new int[val];
                for (int j = 0; j < helpUni.length; j++){
                    unique[j] = helpUni[j];
                }
            }
        }

        for (int i = 0; i < arr2.length; i++){
            boolean isUni = true;
            for(int j = 0; j < unique.length; j++){
                if (arr2[i] == unique[j]){
                    isUni = false;
                    break;
                }
            }
            if (isUni){
                val += 1;
                helpUni = new int[val];
                for (int j = 0; j < unique.length; j++){
                    helpUni[j] = unique[j];
                }
                helpUni[val -1 ] = arr2[i];
                unique = new int[val];
                for (int j = 0; j < helpUni.length; j++){
                    unique[j] = helpUni[j];
                }
            }
        }
        for (int i = 0; i < unique.length; i ++){
            System.out.print(unique[i] + " ");
        }
        System.out.println();
        int min = unique[0];
        int max = unique[0];

        for (int i = 1; i < unique.length; i++){
            if (min > unique[i]){
                min = unique[i];
            }
            if (max < unique[i]){
                max = unique[i];
            }
        }

        for (int i = min + 1; i < max; i++){
            System.out.print(i + " ");
        }


    }
}
