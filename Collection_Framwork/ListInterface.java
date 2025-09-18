package Collection_Framwork;

import java.util.*;

public class ListInterface {
    static void ArrayListExample(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(1));
        l.set(1,10);
        System.out.println(l);

        System.out.println(l.contains(10));

    }

    static void LinkedListExample(){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(2));
        l.set(1,4);
        System.out.println(l);

        System.out.println(l.contains(10));

    }

    static void stackExample(){
        Stack<String> st = new Stack<>();
        st.push("Sahil");
        st.push("Nimje");
        System.out.println(st);
        System.out.println("Pop the element : " +st.pop());
        System.out.println(st);

        System.out.println(st.size());
        System.out.println(st.empty());
    }


    public static void main(String[] args) {
        ArrayListExample();
        LinkedListExample();
        stackExample();
    }
}
