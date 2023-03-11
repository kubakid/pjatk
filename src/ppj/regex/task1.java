package ppj.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("^\\d{4}-(0[1-9]|[1-9]|1[0-2])-([1-9]|0[1-9]|[1-3][0-9])$");
        Matcher date = p.matcher("2020-12-40");
        System.out.println(date.find());
    }



}
