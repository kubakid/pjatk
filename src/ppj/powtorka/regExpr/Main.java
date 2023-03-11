package ppj.powtorka.regExpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    // oznaczenia

    // [cad] - jeden konkretny znak z trzech podanych
    // [a-z] - litery  w zakresie a-z
    // a|b - a albo B
    // \\d - dowolna cyfra
    // \\w - mała, duża litera albo cyfra
    // . - kropka to dowolny znak
    // a{3} - znak a dokładnie trzy razy
    // a{3,} - znak a przynamniej trzy razy
    // a{10,12) znak a od 10 do 12 razy
    // ^ - fraza musi rozpoczynać linię
    // $ - fraza kończy linie

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{3}.tak$");
        Matcher matcher = pattern.matcher("aiwiowuioua122otak");

        boolean a = matcher.find();
        System.out.println(a);
    }
}
