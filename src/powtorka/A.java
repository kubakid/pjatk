package powtorka;

public class A {
//    ========================= task2
    int val = 30;
    A a;
    public A(int i ){
        this(2f);
        System.out.println("A(int)");
        a = new A(i*2f);
        this.val = 20;
    }
    public A(float f){
        System.out.println("A(float)" + f);
        val = 40;
    }
    private A(double d){
        this(10);
        System.out.println("A(double)");
    }

    //================================================= task3

//    static int i = 10;
//    int j  = 100;
//    {
//
//    methodOne();
//    i = 100;
//    j = 10;
//
//    }
//
//    void methodOne(){
//        System.out.println("i = "+i);
//        System.out.println("j = "+j);
//    }

//
//    String s;
//    A a;
//    public A(String s){
//        this.s = s;
//    }

}
