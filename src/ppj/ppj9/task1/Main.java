package ppj.ppj9.task1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pass month: ");
        int month = scanner.nextInt();
        System.out.println("Pass year: ");
        int year = scanner.nextInt();
        printMonth(month,year);
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

}
