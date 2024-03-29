package ppj.ppj11.tasks;

import ppj.ppj12.tasks.DrzewoBezOwocoweException;

public class Tree {

    public Tree(){}

    private boolean evergreen;
    private int height;
    private String crossSection;

    public Tree(boolean evergreen, int height, String crossSection){
        this.evergreen = evergreen;
        this.height = height;
        this.crossSection = crossSection;
    }

    @Override
    public String toString() {
        return "Evergreen: " + evergreen + ", height: " + height+ ", cross section of tree: " + crossSection;
    }

    public void zerwijOwoc() throws DrzewoBezOwocoweException {
        if (!getClass().toString().equals("class ppj.ppj11.wyklad.tasks.FruitTree"))
            throw new DrzewoBezOwocoweException();

    }


}
