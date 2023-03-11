package ppj.ppjZao_8and9.ppj8.task3;

public class PPJ8Task3 {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1}
        };

        int numberOfElements = 0;
        for (int i = 0; i < tab.length; i++) {
            numberOfElements += tab[i].length;
        }

        int[] result = new int[numberOfElements];
        for (int i = 0, indexOfResult = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                result[indexOfResult++] = tab[i][j];
            }
        }

        for (int e :
                result) {
            System.out.print(e+"\t");
        }

    }
}
