package ppj10.tasks.task7;

public class Balloon {

    private float pojemnosc;
    private double load;

    public Balloon(){
        this.pojemnosc = (float)(Math.random()) * (0.009f - 0.005f) + 0.005f;

    }

    public double getLoad(){
        load = (pojemnosc/0.007) * 8.571428571;
        return load;
    }

}
