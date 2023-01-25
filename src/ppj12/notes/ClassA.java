package ppj12.notes;

public class ClassA {
    public static void methodA(int a) throws MyException {
        if(a > 5)
            throw new MyException();
        System.out.println(a);
    }

    public static void methodB(int a) throws Exception {
        if(a > 5)
            throw new Exception("Exception");
        System.out.println(a);
    }

    public static void methodC(int a) {
        if(a > 5)
            throw new RuntimeException("RuntimeException");
        System.out.println(a);
    }
}
