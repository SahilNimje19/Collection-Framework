package Collection_Framwork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class setInterfaceExample {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(55);
        st.add(67);

        System.out.println(st); // 1 2 3 4
        st.add(1);
        st.add(2);
        System.out.println(st); // 1 2 3 4 No duplicates

        st.remove(2);
        System.out.println(st);
        System.out.println(st.contains(5));
        System.out.println(st.size());

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(4);
        lhs.add(2);
        lhs.add(3);
        System.out.println(lhs);
        System.out.println(lhs.contains(3));
        lhs.remove(1);
        System.out.println(lhs);
        System.out.println(lhs.size());


        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(30);
        ts.add(40);
        ts.add(20);
        ts.add(10);
        System.out.println(ts); // print in sorted order

    }
}
