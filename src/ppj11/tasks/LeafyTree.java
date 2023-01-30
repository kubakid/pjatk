package ppj11.tasks;

public class LeafyTree extends Tree{

    private int shapeOfLeaf;

    public LeafyTree(int shapeOfLeaf) {
        this.shapeOfLeaf = shapeOfLeaf;
    }

    public LeafyTree(boolean evergreen, int height, String crossSection, int shapeOfLeaf) {
        super(evergreen, height, crossSection);
        this.shapeOfLeaf = shapeOfLeaf;
    }

    @Override
    public String toString() {
        return super.toString()+ ", shape of leaf: " + shapeOfLeaf;
    }
}
