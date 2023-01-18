package ppj11.wyklad.tasks;

public class FruitTree extends LeafyTree {

    private String fruitName;


    public FruitTree(int shapeOfLeaf) {
        super(shapeOfLeaf);
    }

    public FruitTree(boolean evergreen, int height, String crossSection, int shapeOfLeaf) {
        super(evergreen, height, crossSection, shapeOfLeaf);
    }

    @Override
    public String toString() {
        return super.toString() + ", fruit name: " + fruitName;
    }
}
