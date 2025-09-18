package Collection_Framwork;

import java.util.Arrays;
import java.util.LinkedList;

public class linkedListNode {
    public static void main(String[] args) {;
        LinkedList<Integer>  ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.get(2); // O(n)
        ll.addLast(4); // O(1)
        ll.addFirst(0); // O(1)
        ll.getFirst();
        ll.getLast();

        System.out.println(ll);
        ll.removeIf(x -> x%2==0);
        System.out.println(ll);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Cat","Lion"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);




    }
}
