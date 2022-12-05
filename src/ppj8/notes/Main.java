package ppj8.notes;

public class Main {
    public static void main(String[] args) {
        // Kolokwium do metod rekurencyjnych włącznie

        //tablice
//        {
//            int[] tab = {1, 2, 3};
//            int[] tabNew = new int[3];
//
//            //ostatni element tablicy
//            System.out.println(tab[tab.length - 1]);
//        }
//
//        //tablice dwuwymiarowe
//        {
//            int[][] tab = {{1, 2, 3}};
//
//            int[][] tab2D = {
//                    {1, 2, 3},
//                    {4, 5, 6},
//                    {7, 8, 9}
//            };
//
//            int[][] trzypocztery = new int[3][4];
//        }

    showFrom0toN(5);
    }
//    public static int plusOne(int a){
//        a++;
//        return a;
//    }
//
//    public static int plusOneArr (int[] a){
//        a[0]++;
//        return a[0];
//    }
    public static void showFrom0toN (int n){
        if (n <= 0) {

            System.out.print(n + "  ");
        }
        else{
            showFrom0toN(n-1);
            System.out.print(n + "  ");
        }
    }
}


