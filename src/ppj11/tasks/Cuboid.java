package ppj11.tasks;

public class Cuboid extends Rectangle {

    private int depth;

    public Cuboid(int height, int length, int depth) {
        super(height, length);
        this.depth = depth;
    }

    public Cuboid (int depth){
        this.depth = depth;
    }


    @Override
    public void showArea() {
        System.out.println("Area = " + (2 * depth * getHeight() + 2 * getLength() * getHeight() + 2 * getLength() * depth));
    }

    public void showVolume(){
        System.out.println("Volume = "+ (depth * getHeight() * getLength()));
    }
}
