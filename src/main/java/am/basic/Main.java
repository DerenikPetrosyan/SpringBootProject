package am.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String s = "59999";

        Pattern pattern = Pattern.compile("^([1-9][0-9]{0,3}|[1-5][0-9]{4}|6[0-4][0-9]{3}|65[0-4][0-9]{2}|655[0-2][0-9]|6553[0-5])$");

        Matcher matcher = pattern.matcher(s);

        boolean b = matcher.matches();

        System.out.println(b);

    }
}
