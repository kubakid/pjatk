package ppjZao_8and9.ppj8.task2;

public class PPJ8Task2 {
    public static void main(String[] args) {
        int size = 8;
        float[][] tab = new float[size][size];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (float)(Math.random()*10);
                System.out.printf("%.2f\t",tab[i][j]);
            }
            System.out.println();
        }
        float diagonalSum = 0;
        float counterDiagonalSum = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if(i==j)
                    diagonalSum+=tab[i][j];
                if(i + j == tab.length - 1)
                    counterDiagonalSum+=tab[i][j];
            }
        }
        System.out.println("diagonalSum = " + diagonalSum);
        System.out.println("counterDiagonalSum = " + counterDiagonalSum);

    }
}
