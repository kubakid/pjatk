package kol2przyklad;

public class Test {
    public static void main(String[] args) {

        int[] tab = {1, 2, 3};
        int[] tabX = tab;
        tab[0] = 9;
        tab[tab.length-1] = 8;
        tabX[0] = 7;
        tabX[tab.length-1] = 6;
        int[][] tabY ={tab,tabX};
        for (int[] ints : tabY) {
            for (int i = ints.length-1; i >= 0; i--) {
                System.out.print(ints[i] + "\t");
            }
            System.out.println();
        }
}}
