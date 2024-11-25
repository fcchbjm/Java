package whpu.T.Test;

import java.util.ArrayList;

public class test1 {
    static int n;
    public static void count() {
        n++;
        //throw new RuntimeException();
        //return n;
    }
    public static void main(String args[])
    {
        //List al = new ArrayList<String>();
        //ArrayList<String> al = new List<String>();
        ArrayList al = new ArrayList();

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.compareTo(s2));
    }
}
