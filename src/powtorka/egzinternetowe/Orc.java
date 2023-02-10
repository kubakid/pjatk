package powtorka.egzinternetowe;

public class Orc
    extends Monster{
    private String weapon;

    public Orc(String name, int damage, String weapon){
        super(name, damage);
        this.weapon = weapon;
    }

    public Orc(String name, int damage) {
        super(name, damage);
        this.weapon = null;
    }
    public int getDamage(){
        if(weapon != null)
            return super.getDamage()*2;
        return super.getDamage();
    }
}
