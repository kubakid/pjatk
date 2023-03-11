package ppj.ppj8.tasks.task3;

public class Main {
    public static void main(String[] args) {
        int [][] tab =  {
            {1,0,0,0,0},
            {0,1,0,0},
            {0,0,1}
        };

        int length = 0;

        for (int[] value : tab) {
            length += value.length;
        }
        int[] arr = new int[length];
        int index = 0;

        for (int[] ints : tab) {
            for (int j = 0; j < ints.length; j++, index++) {
                arr[index] = ints[j];
            }
        }

        for (int j : arr) {
            System.out.print(j + "  ");
        }

    }
}
