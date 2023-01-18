package ppj11.wyklad.tasks;

public class Rectangle {

    private int height;
    private int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public Rectangle(){
    }

    public void showArea(){
        System.out.println("Area = "+ height*length);
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
}
