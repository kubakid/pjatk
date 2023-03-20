package gui.gui2;

public class GamerPapier implements IGamer{

    @Override
    public int play() {
        return 2;
    }

    @Override
    public String name() {
        return "Gracz Papier";
    }
}
