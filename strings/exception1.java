package strings;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exception1 {
    public static void main(String[] args) {
        try {
           // FileReader t = new FileReader("anuu.text");
            int a=6;
            int b=0;
            int c=a/b;
        }
//        catch (FileNotFoundException e)
//        {
//            System.out.println("file not found "+e);
//
//        }
        catch (Exception f) {
            System.out.println("denominator number should not be zero "+f);

        }
        try {
            int a=8;
            int b=0;
            int c=a/b;
        }
        catch (Exception e) {
            System.out.println("denominator number should not be zero "+e);

        }
    }
}
