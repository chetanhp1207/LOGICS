package substring;

public class Str7 {
    public static void main(String args[]) {

        // remove all vowels from string
        String s = "CHetan H Patgar @1207#";
        System.out.println(s);
        System.out.println(s.replaceAll("[aeiouAEIOU]", ""));

        // remove all consonants
        System.out.println(s);
        System.out.println(s.replaceAll("[^aeiouAEIOU]", ""));

        // replace all white spaces with underscore
        System.out.println(s);
        System.out.println(s.replaceAll(" ", "_"));

        // extract only uppercase letters
        System.out.println(s);
        System.out.println(s.replaceAll("[^A-Z]", ""));

        // extract only lowercase letters
        System.out.println(s);
        System.out.println(s.replaceAll("[^a-z]", ""));

        // check whether string contains only digits
        String s1 = "1223445567890";

        if (s1.matches("[0-9]+"))
            System.out.println("String contains only digits");
        else
            System.out.println("String contains letters or special characters along with digits");

        // check whether string contains only alphabets
        String s2 = "JavaHtmlCSSJavascript";

        if (s2.matches("[A-Za-z]+"))
            System.out.println("String contains only alphabets");
        else
            System.out.println("String contains digits and special characters along with alphabets");

        // check whether string is alphanumeric
        String s3 = "Chetan1207";

        if (s3.matches("[A-Za-z0-9]+"))
            System.out.println("String is alphanumeric");
        else
            System.out.println("String is not alphanumeric");

        // remove all characters except vowels
        String s4 = "hi hello How are you";
        System.out.println(s4);
        System.out.println(s4.replaceAll("[^aeiouAEIOU]", ""));

        // replace all characters except alphabets and digits with @
        String s5 = "Chetan #$%1234";
        System.out.println(s5);
        System.out.println(s5.replaceAll("[^A-Za-z0-9]", "@"));

        // count the number of special characters
        String s6 = "Chetan #$%1234";
        System.out.println(s6);
        System.out.println(s6.replaceAll("[A-Za-z0-9]", "").length());

        // count the number of alphabets
        String s7 = "Chetan #$%1234";
        System.out.println(s7);
        System.out.println(s7.replaceAll("[^A-Za-z]", "").length());

        // count the number of uppercase letters
        String s8 = "JSpiders Rajajinagar";
        System.out.println(s8);
        System.out.println(s8.replaceAll("[^A-Z]", "").length());

        // count the number of lowercase letters
        String s9 = "JSpiders Rajajinagar";
        System.out.println(s9);
        System.out.println(s9.replaceAll("[^a-z]", "").length());

        // remove all occurrences of specific word
        String s10 = "hi helo hi how are you hi bye hello byee bye";
        System.out.println(s10);
        System.out.println(s10.replaceAll("hi", ""));
    }
}
