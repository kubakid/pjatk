package kol2przyklad.algorytmy;

public class Main {

    public static void main (String[] args){

    }

    //algorytmy

    public static void sortArrAscending(int[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }


    public static void sortArrDescending(int[] arr) {
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            int temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }


    public static int getIntRandomNumber(int min, int max){
        //range [min, max]
        return (int) (Math.random() * (max - min + 1) + min);
    }



    public static int[] getInt1DArr(int length){
        int[] arr = new int[length];
        for (int i = 0, counter = 1; i < arr.length; i++) {
            arr[i] = counter++;
        }
        return arr;
    }

    public static int[][] getInt2DArr(int rows, int columns){
        int[][] arr = new int[rows][columns];
        for (int i = 0, counter = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = counter++;
            }
        }
        return arr;
    }

    public static int[] resizeArr (int[] a){
        int [] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++ ){
            b[i] = a[i];
        }
        return b;
    }


}
