package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("^\\d{4}-\\d{2}-\\d{1,2}$");
        Matcher date = p.matcher("1234-24-11");
        System.out.println(date.find());
    }
}
