package strings;

import java.util.Locale;

public class strng1 {
    public static void main(String[] args){
        String name="ajaykumar";
        String sis="anu";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.compareTo(sis));
        System.out.println(name.replace("ajay","manju"));
        System.out.println(sis.toLowerCase(Locale.ROOT));
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(sis.concat(name));
        System.out.println(name.chars());
        System.out.println(name.charAt(3));
        System.out.println(sis.charAt(2));
        System.out.println(name.substring(2,4));
        System.out.println("sister of "+ name);
        System.out.println("brother of "+ sis);
    }
}
