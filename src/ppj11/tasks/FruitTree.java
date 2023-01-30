package ppj11.tasks;

public class FruitTree extends LeafyTree {

    private String fruitName;

    public FruitTree(boolean evergreen, int height, String crossSection,int shapeOfLeaf, String fruitName) {
        super(evergreen, height, crossSection, shapeOfLeaf);
        this.fruitName = fruitName;
    }

    @Override
    public String toString() {
        return super.toString() + ", fruit name: " + fruitName;
    }
}
