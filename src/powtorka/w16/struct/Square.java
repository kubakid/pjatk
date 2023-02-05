package powtorka.w16.struct;

import java.awt.*;

public
    class Square
    extends Point {

    public Square(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public void draw(Graphics g) {
        setColor(g);
        g.fillRect(
            this.x-5, this.y-5,
            10, 10
        );
        super.draw(g);
    }

    @Override
    public String toString() {
        return "Kwadrat( "+super.toString()+")";
    }
}
