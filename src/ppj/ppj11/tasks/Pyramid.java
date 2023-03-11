package ppj.ppj11.tasks;

public class Pyramid extends Triangle{

    private int height;

    public Pyramid(int height) {
        this.height = height;
    }

    public Pyramid(float radius, int height) {
        super(radius);
        this.height = height;
    }

    @Override
    public void showArea() {
        System.out.println("Area = " + (Math.pow(getRadius(),2) * Math.sqrt(3) / 4.0) + Math.sqrt(Math.pow(getRadius(),
                2) + Math.pow(height,2)));
    }

    public void showVolume() {
        System.out.println("Volume = " + (Math.pow(getRadius(),2) * Math.sqrt(3) / 4.0 * height / 3.0)  );
    }
}
