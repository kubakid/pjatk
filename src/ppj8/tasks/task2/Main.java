package ppj8.tasks.task2;

public class Main {
    public static void main(String[] args) {
        float [][] arr = new float[8][8];
        float leftSum = 0;
        float rightSum = 0;
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (float)(Math.random());
                if (arr[i].length - i - 1 == j){
                    rightSum += arr[i][j];
                }
                if (i == j){
                    leftSum += arr[i][j];
                }
            }
        }

        System.out.println(leftSum);
        System.out.println(rightSum);
    }
}
