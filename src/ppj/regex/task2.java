package ppj.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^([0-9]|[A-F])+$");
        Matcher val = p.matcher("45938259234895845AAA");
        System.out.println(val.find());
    }
}
