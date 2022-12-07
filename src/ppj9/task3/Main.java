package ppj9.task3;

public class Main {
    public static void main(String[] args) {
        int [][] taba = {{1,2}, {3,4}, {5,6}};
        int [][] tabb = {{1,2}, {3,4}, {5,6}};
        int [][] tabc = {{1,2}, {3,4}, {2,3}};

        System.out.println(jestRowna(taba, tabb));
        System.out.println(jestRowna(taba, tabc));

    }

    public static boolean jestRowna(int[][] a, int[][] b){
        if (a.length == b.length){
            for (int i = 0; i < a.length; i++){
                if (a[i].length != b[i].length){
                    return false;
                }
            }
        }
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                if (a[i][j] != b[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
