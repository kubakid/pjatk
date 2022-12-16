package ppjZao_8and9.ppj9.task1;

import java.time.LocalDate;

public class PPJ9Task1 {
    public static void main(String[] args) {
        printMonth(12,2022);
    }

    public static void printMonth(int m, int y) {
        LocalDate date = LocalDate.of(2022, 12, 1);
        int offset = date.getDayOfWeek().getValue() - 1;

        System.out.print(1 + "\t");
        for (int i = 0; i < offset; i++) {
            System.out.print("\t");
        }

        for (int day = 1, weekNumber = 1; day <= date.lengthOfMonth(); day++) {
            System.out.print(day + "\t");

            if ((day + offset) % 7 == 0)
                System.out.print("\n" + ++weekNumber +"\t");
        }

    }
}
