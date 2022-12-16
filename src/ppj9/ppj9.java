package ppj9;

import java.time.LocalDate;
import java.util.Scanner;

public class ppj9 {
    public static void main(String[] args) {
        // TASK 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pass month: ");
        int month = scanner.nextInt();
        System.out.println("Pass year: ");
        int year = scanner.nextInt();
        printMonth(month,year);




        //TASK 2

        char[] tab = {'a', 'l', 'a', 'm','a', 'k','o','t','a'};
        countLetters(tab);



        //TASK 3

        int [][] taba = {{1,2}, {3,4}, {5,6}};
        int [][] tabb = {{1,2}, {3,4}, {5,6}};
        int [][] tabc = {{1,2}, {3,4}, {2,3}};

        System.out.println(jestRowna(taba, tabb));
        System.out.println(jestRowna(taba, tabc));


        //TASK 4

        for (int j : splitToDigits(12345)){
            System.out.print(j + " ");
        }


        // TASK 5

        System.out.println(isArmstrongNumber(153));


        // TASK 6

        for (int i = 0; i< calculateSquares(60, 30, 7).length; i++){
            System.out.println(calculateSquares(60, 30, 7)[i][0] + " " + calculateSquares(60, 30, 7)[i][1]);
        }
        calculateSquares(60, 30, 7);


        // TASK 7

        int [] arr = {1,2,3};
        swap(arr, 0,2);
        for (int i : arr){
            System.out.println(i);
        }


        // TASK 8

        char [] ala = {'a', 'l', 'a'};
        System.out.println(isPalindrom(ala));



    }

    public static void printMonth(int m, int y){
        LocalDate firstDay = m > 9 ? LocalDate.parse(y+"-"+m+"-01") : LocalDate.parse(y+"-0"+m+"-01");
        int firstDayVal = firstDay.getDayOfWeek().getValue();
        int days = firstDay.lengthOfMonth();
        System.out.println(days);
        int l = 5;
        if (firstDayVal == 1 && days == 28 ){
            l = 4;
        }
        int counter = 1;
        for (int i = 0; i < l; i++){
            for ( int j = 0; j < 8; j++){
                if (j == 0)
                    System.out.print((i+1) + "\t");
                else {
                    if (i == 0 && j < firstDayVal) {
                        System.out.print("  " + "\t");
                    } else if (counter < 10) {
                        System.out.print(" " + counter + "\t");
                        counter++;
                    } else {
                        System.out.print(counter + "\t");
                        counter++;
                    }
                }
                if (days < counter)
                    break;
            }
            System.out.println();
        }
    }




    public static void countLetters (char[] arr){
        char[] unique = {arr[0]};

        for (char item : arr) {
            boolean isUni = true;
            for (char c : unique) {
                if (item == c) {
                    isUni = false;
                    break;
                }
            }
            if (isUni) {
                char[] helpUni = new char[unique.length + 1];
                for (int j = 0; j < unique.length; j++) {
                    helpUni[j] = unique[j];
                }
                helpUni[helpUni.length - 1] = item;
                unique = new char[helpUni.length];
                for (int j = 0; j < helpUni.length; j++) {
                    unique[j] = helpUni[j];
                }
            }

        }
        for (char c : unique) {
            int counter = 0;
            for (char value : arr) {
                if (c == value)
                    counter++;
            }
            System.out.println(c + ": " + counter);
        }
    }

    public static boolean jestRowna(int[][] a, int[][] b){
        if (a.length != b.length){
            return false;
        }
            for (int i = 0; i < a.length; i++){
                if (a[i].length != b[i].length){
                    return false;
                }
            }
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                if (a[i][j] != b[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] splitToDigits(int n){
        int a = 0;
        int helpN = n;
        while (helpN != 0){
            helpN /= 10;
            a++;
        }
        int[] splited = new int[a];

        for (int i = 0; i < splited.length; i++){
            splited[splited.length - 1 - i] = n % 10;
            n /= 10;
        }
        return splited;
    }

    public static boolean isArmstrongNumber(int n){
        int length = 0;
        int helpN = n;
        while (helpN != 0){
            length++;
            helpN /= 10;
        }
        helpN = n;
        int sum = 0;
        while (helpN != 0){
            sum += (int)(Math.pow(helpN %10, length));
            helpN /= 10;
        }
        return sum == n;
    }


    public static int[][] calculateSquares ( int screenWidth , int screenHeight , int side ){
        int x;
        int y = 0;
        int counter = 0;
        int [][] xy = new int[(screenHeight/side) * (screenWidth / side)][2];
        for (int i = 0; i < (screenHeight/side); i++){
            x = 0;
            for (int j = 0; j < (screenWidth / side); j++){
                xy[counter][0] = x;
                xy[counter][1] = y;
                x += side;
                counter++;
            }
            y+= side;
        }
        return xy;
    }


    public static void swap ( int [ ] tab , int source , int destination ){
        if (source < 0 || source > tab.length || destination < 0 || destination >= tab.length){
            System.out.println("Sugerowana zamiana wyszłaby poza indeks tablicy");
        } else{
            int pom = tab[source];
            tab[source] = tab[destination];
            tab[destination] = pom;
        }
    }


    public static boolean isPalindrom (char[] arr){
        for (int i = 0; i < arr.length/2; i++){
            if (arr[i] != arr[arr.length - 1 - i])
                return false;
        }
        return true;
    }
}
