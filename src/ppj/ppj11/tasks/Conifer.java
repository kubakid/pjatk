package ppj.ppj11.tasks;

public class Conifer extends Tree{

    private int numberOfNeedles;
    private double coneLength;

    public Conifer(int numberOfNeedles, double coneLength) {
        this.numberOfNeedles = numberOfNeedles;
        this.coneLength = coneLength;
    }

    public Conifer(boolean evergreen, int height, String crossSection, int numberOfNeedles, double coneLength) {
        super(evergreen, height, crossSection);
        this.numberOfNeedles = numberOfNeedles;
        this.coneLength = coneLength;
    }

    @Override
    public String toString() {
        return super.toString()+(", number of needles:" + numberOfNeedles + ", cone length: " + coneLength);
    }
}
