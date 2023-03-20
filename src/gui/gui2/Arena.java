package gui.gui2;

public class Arena {
    IGamer a;
    IGamer b;

    int aWins;
    int bWins;

    public Arena(IGamer a, IGamer b) {
        this.a = a;
        this.b = b;
    }

    public void fight(int rounds){
        for (int i = 0; i < rounds; i++){
            if (a.play() == b.play()) {
                continue;
            }
            else if (a.play() == 1 || b.play() == 1){
                if (b.play() == 2)
                    bWins++;
                else if(b.play()==3)
                    aWins++;
                else
                    aWins++;
            } else if (a.play() == 2 || b.play() == 2) {
                if (b.play()==3)
                    bWins++;
                else
                    aWins++;

            }
        }
    }


}
