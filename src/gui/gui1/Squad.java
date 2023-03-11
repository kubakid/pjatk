package gui.gui1;

import java.util.Arrays;

public class Squad {

    private String name;

    private Hero[] heroes = new Hero[]{};
    private Leader leader;

    public Squad(String name) {
        this.name = name;
    }
    public void setLeader(Leader leader){
        this.leader = leader;
        System.out.println(this.name+", leader: "+leader.getName()+", heroes: ");
    }

    public void addHero(Hero hero) throws TooManyHeroesExceptio{
        for (Hero a: heroes){
            if(a == null){
                a = hero;
                // DO DOKONCZENIA, po dodaniu bohatera ma printować się info o nazwie składu, imieniu leadera i
                // imionach wszystkich bohaterach składu
                return;
            }
        }throw new TooManyHeroesExceptio();
    }

    public void expandSquad(int amount ){
        this.heroes = Arrays.copyOf(heroes,heroes.length + amount);
    }

}
