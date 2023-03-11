package ppj.ppj4.task1;

public class Main {
    public static void main(String[] args) {
        boolean andTx2 = true && true;
        boolean andTx1 = true && false;
        boolean andTx0 = false && false;

        boolean orTx2 = true || true;
        boolean orTx1 = true || false;
        boolean orTx0 = false || false;

        System.out.println("true and true = " + andTx2);
        System.out.println("true and false = " + andTx1);
        System.out.println("false and false = " + andTx0);
        System.out.println("true or true = " + orTx2);
        System.out.println("true or false = " + orTx1);
        System.out.println("false or false = " + orTx0);
    }
}
