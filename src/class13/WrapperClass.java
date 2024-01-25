package class13;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 5;
        Integer b = 7;
        System.out.println(a+b);

        Integer i = new Integer(10);//(unboxing)
        int i1 = i;

        System.out.println("Value of i:" + i);
        System.out.println("Value of i1:" + i1);

        Character gfg = 'b'; // (autoboxing)
        char ch = gfg;
        System.out.println("Value of ch:" + ch);
        System.out.println("Value of gfg:" + gfg);

        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1);
        al.add(12);
        al.add(45);

        System.out.println("ArrayList:" + al);

    }
}
