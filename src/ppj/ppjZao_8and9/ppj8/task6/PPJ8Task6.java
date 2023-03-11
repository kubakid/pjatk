package ppj.ppjZao_8and9.ppj8.task6;

public class PPJ8Task6 {
    public static void main(String[] args) {
        int wrt = 5;
        modifyValue(wrt);
        System.out.println("wrt = " + wrt);
    }

    public static void modifyValue(int a){
        System.out.println(a);
        a*=5;
        System.out.println(a);
    }
}
