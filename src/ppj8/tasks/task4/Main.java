package ppj8.tasks.task4;

public class Main {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] vectors = {
                {1, 0},
                {0,-1},
                {-1,0},
                {0, 1}
        };

        int x = 0;
        int y= 0;
        int vec = 0;

        int [] arr = new int[tab.length * tab[0].length];

        for (int i = 0; i < arr.length; i++){
            boolean duplicated = false;
            for (int j = 0; j < arr.length; j++){ // sprawdzenie czy nie zrobi się po prostu kwadrat
                if(tab[y+ vectors[vec][1]][x + vectors[vec][0]] == arr[j]){
                    duplicated = true;
                    break;
                }

            }
            arr[i] = tab[x][y];

            // w ifie sprawdzamy czy nie wyjdzie poza indeks naszej planszy oraz podpinamy warunek z poprzedniego fora

            if ( x + vectors[vec][0] >= 0 && x + vectors[vec][0] <= tab.length-1 && y+ vectors[vec][1] >= 0 && y + vectors[vec][1] <= tab.length-1 && !duplicated){
                x += vectors[vec][0];
                y += vectors[vec][1];
            }
        }
    }
}
