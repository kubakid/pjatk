package ppj.ppjZao_8and9.ppj8.task4;

public class PPJ8Task4 {
    public static void main(String[] args) {
        int tab[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int rowFirst = 0;
        int rowLast = tab.length - 1;
        int columnFirst = 0;
        int columnLast = tab[0].length - 1;

        while (rowFirst <= rowLast && columnFirst <= columnLast) {
            //FirstRow from left to right
            for (int i = columnFirst; i <= columnLast; i++) {
                System.out.print(tab[rowFirst][i] + "\t");
            }
            rowFirst++;
            //LastColumn from up to down
            for (int i = rowFirst; i <= rowLast; i++) {
                System.out.print(tab[i][rowLast] + "\t");
            }
            columnLast--;
            //LastRow from right to left
            for (int i = columnLast; i >= columnFirst; i--) {
                System.out.print(tab[rowLast][i] + "\t");
            }
            rowLast--;
            //FirstColumn from down to up
            for (int i = rowLast; i >= rowFirst; i--) {
                System.out.print(tab[i][columnFirst] + "\t");
            }
            columnFirst++;
        }
    }
}
