package ppj.powtorka.w11;

public
    class A {

    public int field;

    public A(int field){
        this.field = field;

        this.getClass();
    }

    public String toString(){
        return "class A:toString() -> "+field;
    }

}

class B
    extends A {

    public B(){
        super(-1);
    }

}
