package ppj9.task6;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i< calculateSquares(60, 30, 7).length; i++){
            System.out.println(calculateSquares(60, 30, 7)[i][0] + " " + calculateSquares(60, 30, 7)[i][1]);
        }
        calculateSquares(60, 30, 7);

    }
    public static int[][] calculateSquares ( int screenWidth , int screenHeight , int side ){
        int x;
        int y = 0;
        int counter = 0;
        int [][] xy = new int[(screenHeight/side) * (screenWidth / side)][2];
        for (int i = 0; i < (screenHeight/side); i++){
            x = 0;
            for (int j = 0; j < (screenWidth / side); j++){
                xy[counter][0] = x;
                xy[counter][1] = y;
                x += side;
                counter++;
            }
            y+= side;
        }
        return xy;
    }
}
