package ppj.powtorka.w12;

public
    class Rocket {

    private int fullMass;
    private boolean engineStatus;

    public Rocket(int fullMass) {
        this.fullMass = fullMass;
        this.engineStatus = false;
    }

    public void start()
        throws FullLimitException {
        if(this.fullMass < 100)
            throw new FullLimitException();
        if(Math.random() < 0.2)
            throw new EngineException();
        this.engineStatus = true;
    }

    public void fillFule(int val){
        this.fullMass += val;
    }
}
