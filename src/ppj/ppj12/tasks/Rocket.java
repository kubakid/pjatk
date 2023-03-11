package ppj.ppj12.tasks;

public class Rocket {

    private String name;
    private int fuelsWeight;

    public Rocket(String name, int fuelsWeight) {
        this.name = name;
        this.fuelsWeight = fuelsWeight;
    }

    public Rocket(){};

    public void refuel(){
        this.fuelsWeight += (int) (Math.random() * (10000  + 1));
        System.out.println(fuelsWeight);
    }


    public void start() throws Exception {
        if (fuelsWeight < 1000)
            throw new Exception("Start canceled - too little fuel");
    }

}
