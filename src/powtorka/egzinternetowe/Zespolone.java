package powtorka.egzinternetowe;

public class Zespolone {
    private double re;
    private double im;
    public Zespolone(double re, double im){
        this.re = re;
        this.im = im;
    }

    public Zespolone add(Zespolone z){
        return new Zespolone(re + z.re, im + z.im);
    }

    @Override
    public String toString() {
        return "Zespolone{" +
                "re = " + re +
                ", im = " + im +
                '}';
    }
}
