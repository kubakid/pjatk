package gui.gui2;

public class Square implements Comparable<Square>{

    int length, number;
    static int counter = 1;

    public Square(int length){
        this.length = length;
        this.number = counter;
        counter++;
    }

    public int getArea(){return this.length*this.length;}

    @Override
    public String toString() {
        return ("Number: "+this.number + ", area: "+ this.getArea());
    }

    @Override
    public int compareTo(Square o) {
        return this.getArea() - o.getArea();
    }
}
