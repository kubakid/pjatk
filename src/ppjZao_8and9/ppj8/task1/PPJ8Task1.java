package ppjZao_8and9.ppj8.task1;

public class PPJ8Task1 {
    public static void main(String[] args) {
        int[] tab1 = new int[(int) (Math.random() * 10) + 1];
        int[] tab2 = new int[(int) (Math.random() * 10) + 1];
        int[] tab3 = new int[(int) (Math.random() * 10) + 1];

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < tab3.length; i++) {
            tab3[i] = (int)(Math.random()*100);
        }

        int[][] tab2D = {
                tab1,
                tab2,
                tab3,
        };

        for (int i = 0; i < tab2D.length; i++) {
            for (int j = 0; j < tab2D[i].length; j++) {
                System.out.print(tab2D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
