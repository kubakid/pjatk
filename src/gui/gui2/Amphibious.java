package gui.gui2;

public class Amphibious implements  IAuto, IBoat{

    private boolean isInWater;
    @Override
    public void Move() {
        if (isInWater)
            IAuto.super.Move();
        else
            IBoat.super.Move();
    }
}
