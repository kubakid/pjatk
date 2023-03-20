package gui.gui2;

public class GamerRandom implements IGamer {


    @Override
    public int play() {
        return (int)(Math.random() * 3 + 1);
    }

    @Override
    public String name() {
        return "Gracz Random";
    }
}
