package ppj.ppjZao_8and9.ppj9.task6;

public class PPJ9Task6 {
    public static void main(String[] args) {
        int[][] tab = calculateSquares(11, 15, 5);
        for (int[] arr :
                tab) {
            for (int e :
                    arr) {
                System.out.print(e + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side) {
        int squaresInWidth = screenWidth / side;
        int squaresInHeight = screenHeight / side;
        int numberOfSquares = squaresInWidth * squaresInHeight;

        int[][] result = new int[numberOfSquares][2];

        for (int i = 0, indexResult = 0, positionOnXAxis = 0; i < squaresInWidth; i++, positionOnXAxis += side) {
            for (int j = 0, positionOnYAxis = 0; j < squaresInHeight; j++, positionOnYAxis += side) {
                result[indexResult][0] = positionOnXAxis;
                result[indexResult++][1] = positionOnYAxis;
            }
        }
        return result;
    }
}
