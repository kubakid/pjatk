package ppj10.tasks.task7;

public class Donkey {

    public Donkey(double mass){
        this.mass = mass * 1000;
    }

    private double mass;
    private Balloon[] balloons = {};

    public void addBallon(){
        Balloon[] pom = new Balloon[balloons.length + 1];
        for (int i = 0; i < balloons.length; i++){
            pom[i] = balloons[i];
        }
        pom[pom.length - 1] = new Balloon();

        balloons = new Balloon[pom.length];
        for (int i = 0; i < balloons.length; i++){
            balloons[i] = pom[i];
        }
    }

    public boolean isFlying(){
        double sum = 0;
        for (Balloon balloon : balloons) {
            sum += balloon.getLoad();
        }
        return mass > sum;
    }
}
