package ppj8.tasks.task4;

public class Main {
    public static void main(String[] args) {
        int[][] tab5 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] vectors = {
                {1, 0},
                {0, 1},
                {-1, 0},
                {0, -1}
        };
        int x = 0;
        int y = 0;
        int vec = 0;

        int[] arr5 = new int[tab5.length * tab5[0].length];

        for (int i = 0; i < arr5.length-1; i++) {
            boolean duplicated = false;
            boolean isOutOfRange =false;
            arr5[i] = tab5[y][x];

            if(x + vectors[vec][0] > tab5.length - 1 || y + vectors[vec][1] > tab5.length - 1 || x + vectors[vec][0] < 0 || y + vectors[vec][1] < 0){
                isOutOfRange = true;
            }
            for (int j = 0; j <= i; j++) {
                if(isOutOfRange){
                    break;
                }else {
                    if (tab5[y + vectors[vec][1]][x + vectors[vec][0]] == arr5[j]) {
                        duplicated = true;
                        break;
                    }
                }
            }
            if (isOutOfRange || duplicated) {
                if (vec == 3)
                    vec = 0;
                else
                    vec+=1;
            }

            x += vectors[vec][0];
            y += vectors[vec][1];
        }

        arr5[tab5.length * tab5[0].length - 1] = tab5[y][x];

        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + "\t");
        }
    }
}
