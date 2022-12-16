package ppjZao_8and9.ppj8.task7;

public class PPJ8Task7 {
    public static void main(String[] args) {
        System.out.println(findMax(5,10,15));
    }
    public static int findMax(int a, int b, int c){
        if(a>b && a>c)
            return a;
        if(b>c)
            return b;
        return c;
    }
}

