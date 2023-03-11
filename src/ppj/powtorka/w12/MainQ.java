package ppj.powtorka.w12;

import java.util.Arrays;

public
    class MainQ {

    public static void main(String[] args) {
        int[] tab = new int[10];
        for(int i=0; i<tab.length; i++)
            tab[i] = (int)(Math.random()*10);
        System.out.println(Arrays.toString(tab));
        System.out.println(fun(tab, 0));
    }

    public static int fun(int[] arr, int counter){
        if(arr.length-1 == counter)
            return arr[counter];
        int tmp = fun( arr, counter + 1);
        if(arr[counter] > tmp)
            return arr[counter];
        else
            return tmp;
    }
}
