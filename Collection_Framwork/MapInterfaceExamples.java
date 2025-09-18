package Collection_Framwork;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfaceExamples {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(3, "Sahil");
        mp.put(2, "Aman");
        mp.put(1, "Om");
//        System.out.println(mp);
//        System.out.println(mp.get(2));
//        System.out.println(mp.containsKey(3));
//        System.out.println(mp.containsValue("Sahil"));

        mp.put(1, "Kaushal"); // Past value is over-ridden by new value
//        System.out.println(mp);

        mp.putIfAbsent(4,"Rohan");
//        System.out.println(mp);

//        System.out.println(mp.entrySet()); // print the map
//
//        System.out.println(mp.keySet());
//        System.out.println(mp.values());

        // Iterating over in a map

        for (Integer i : mp.keySet()) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (String i : mp.values()) {
            System.out.print(i + " ");
        }

        System.out.println();
        // Feacture of Java 10 instead of datatype in foreach loop use var
        // Exapmle
        for (var i  : mp.keySet()) {
            System.out.print( i + " ");

        }
        System.out.println();
        for (var i  : mp.values()) {
            System.out.print( i + " ");
        }
        System.out.println();


        // Iterate Key-value mapping
        for (var e : mp.entrySet()){
            System.out.println(e);
        }



        // LinkedHashMap
        Map<Integer, String> p = new LinkedHashMap<>();
        p.put(3, "Sahil");
        p.put(2, "Aman");
        p.put(1, "Om");
        System.out.println(p);  // in order of insertion


        // TreeMap
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "Sahil");
        tm.put(2, "OM");
        tm.put(4,"Ram");
        tm.put(7, "Sham");
        System.out.println(tm); // sorted in ket ordered format


    }
}
