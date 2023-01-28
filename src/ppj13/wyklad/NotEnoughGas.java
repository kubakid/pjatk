package ppj13.wyklad;

public class NotEnoughGas extends Exception{

    public NotEnoughGas(int fuel) {
        super("Not enough gas: "+ fuel+ " , tank");
    }
}
