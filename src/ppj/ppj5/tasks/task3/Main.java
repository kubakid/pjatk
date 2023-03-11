package ppj.ppj5.tasks.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // zasady
        // 50 -62.5  to trzy, 62,6 do 74.9 to trzy i pół , 75 do 81.24 to 4, 81.25 do 87.4 to cztery i pol, powyzej
        // to piec
        Scanner scanner = new Scanner(System.in);
        float min = scanner.nextFloat();
        double max = scanner.nextFloat();
        scanner.close();
        if (min / max >= 0.875){
            System.out.println("Ocena: 5");
        } else if (min / max >= 0.8125){
            System.out.println("Ocena: 4.5");
        } else if (min / max >= 0.75){
            System.out.println("Ocena: 4");
        } else if (min/max >= 0.626){
            System.out.println("Ocena 3.5");
        } else if (min/max >= 0.5){
            System.out.println("Ocena: 3");
        } else{
            System.out.println("brak zaliczenia");
        }
    }
    // 15 na 45 = brak zaliczenia
    // 5 na 8 : ocena: 3
    //3 na 5,5 : ocena: 3
    // 40 na 45 : ocena : 5


}
