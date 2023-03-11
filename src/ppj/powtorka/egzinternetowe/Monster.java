package ppj.powtorka.egzinternetowe;

public class Monster {
    private String name;
    private int damage;
    private int health;
    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    public String getName() {
        return name;
    }
    public int getDamage(){
        return damage;
    }
    public void setHealth(int health){
        this.health = health;
    }

}
