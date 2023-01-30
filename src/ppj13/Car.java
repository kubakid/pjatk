package ppj13;



public class Car {
    private int fuel;
    private int distance;

    public Car(){
        this.fuel = 35;
        this.distance = 0;
    }

    public void fill(){
        if ((int)(Math.random() *10+1) == 1){
            throw new Explosion();
        } else {
            this.fuel += (int)(Math.random() * ( 35-15 + 1) + 15);
            System.err.println("After filling: " + this.fuel);
        }
    }

    public void drive100km () throws NotEnoughGas{
        if ( this.fuel < 10) {
            throw new NotEnoughGas(this.fuel);

        } else {
            this.fuel -= 10;
            this.distance += 100;
            System.err.println("Distance traveled: " + this.distance + ", remaining fuel: " + this.fuel);

        }
    }
}

