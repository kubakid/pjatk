package ppj11.wyklad.tasks;

public class Prism extends Triangle {
    private int height;

    public Prism(int height) {
        this.height = height;
    }

    public Prism(float radius, int height) {
        super(radius);
        this.height = height;
    }

    @Override
    public void showArea() {
        System.out.println("Area = " + (Math.pow(getRadius(),2) * Math.sqrt(3) / 2.0) + getRadius()*height  * 4);
    }

    public void showVolume(){
        System.out.println("Volume = " + (Math.pow(getRadius(),2) * Math.sqrt(3) / 4 * height));
    }
}
