package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d{2}");

        Pattern task4 = Pattern.compile("(([a-z]|[A-Z]).){4}");

        Pattern task5 = Pattern.compile("(^1(01)*$)|(^0(10)*$)");

        Matcher m = task5.matcher("01010");
        System.out.println(m.find());
    }
}
