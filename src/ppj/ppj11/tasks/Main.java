package ppj.ppj11.tasks;

public class Main {
    public static void main(String[] args) {
        Phrase phrase = new Phrase("Tata i mama");
        phrase.addWordAtEnd("poszli");
        phrase.addWordAtEnd("na");
        phrase.addWordAtEnd("zakupy");
        phrase.show();


        Rectangle rectangle = new Rectangle(5,5);
        rectangle.showArea();

        Cuboid cuboid = new Cuboid(2,3,4);
        cuboid.showArea();
        cuboid.showVolume();

        Prism prism = new Prism(5,10);
        prism.showArea();
        prism.showVolume();

        Pyramid pyramid = new Pyramid(5, 10);
        pyramid.showArea();
        pyramid.showVolume();


        Triangle triangle = new Triangle(10);
        triangle.showArea();


        Welder welder = new Welder("kuba", 5);
        welder.wyswietl();
    }



}
