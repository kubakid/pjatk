package ppj11.tasks;

public class Triangle {

    private float radius;

    public Triangle(){

    }

    public Triangle(float radius) {
        this.radius = radius;
    }

    public void showArea(){
        System.out.println("Area = " + (Math.pow(radius,2) * Math.sqrt(3) / 4));
    }

    public float getRadius() {
        return radius;
    }
}
