package ppj12.notes;

public class Main {
    public static void main(String[] args) {
        /*{
            System.out.println("Start");
            int[] tab = new int[10];
            try {
                System.out.println(tab[15]);
                System.out.println(tab[5]);
            } catch (IndexOutOfBoundsException e) {
                //e.printStackTrace();
                //System.out.println(e.getMessage());
                System.out.println("Error");
            }
        }*/

        /*try {
            ClassA.methodA(2);
            ClassA.methodA(7);
            ClassA.methodA(2);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        try {
            ClassA.methodB(2);
            ClassA.methodB(7);
            ClassA.methodB(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

        try {
            ClassA.methodC(2);
            ClassA.methodC(7);
            ClassA.methodC(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ClassA.methodC(2);
        ClassA.methodC(7);
        ClassA.methodC(2);

        System.out.println("Stop");
    }
}
