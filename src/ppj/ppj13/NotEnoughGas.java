package ppj.ppj13;

public class NotEnoughGas extends Exception{

    public NotEnoughGas(int fuel) {
        super("Not enough gas: "+ fuel+ " , tank");
    }
}
