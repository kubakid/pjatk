package ppjZao_8and9.ppj9.task7;

import java.util.Arrays;

public class PPJ9Task7 {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5};
        swap(tab,1,3);
        System.out.println(Arrays.toString(tab));
    }
    public static void swap(int[] tab, int source, int destination){
        int temp = tab[source];
        tab[source] = tab[destination];
        tab[destination] = temp;
    }

}
