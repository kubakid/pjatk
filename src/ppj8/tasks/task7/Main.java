package ppj8.tasks.task7;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(maxOfThree(arr[0], arr[1], arr[2]));
    }

    public static int maxOfThree (int a, int b, int c){
        if (a > b && a > c)
            return a;
        if (b > a && b > c)
            return b;
        return c;

    }
}
