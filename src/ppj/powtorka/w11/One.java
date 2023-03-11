package ppj.powtorka.w11;

public
    class One {

    protected int val = 10;
}

class Two
    extends One{

    protected int val = 20;

    public void showSum(int val){
        System.out.println(
            val + this.val + super.val
        );
    }
}
