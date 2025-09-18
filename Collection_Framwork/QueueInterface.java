package Collection_Framwork;


import java.util.*;

public class QueueInterface {
    static void QueueExamples(){
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q);

    }
    static void PriorityQueueExample() {
        // Minpriority
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(7);
        pq.add(9);
        pq.add(3);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
    }
    static void PriorityQueueExample_Max() {
        // Mixpriority
        // This is max  priorith Queue using comparator.reverseOrder()
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(5);
        pq.add(7);
        pq.add(9);
        pq.add(3);
        System.out.println(pq.peek()); // 10
        System.out.println(pq);
        System.out.println(pq.poll()); // 10
        System.out.println(pq);
        System.out.println(pq.peek()); // 9
    }

    static void DequeueExamples() {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq.peek());
        System.out.println(dq); // 2 1 3 4
        System.out.println(dq.pollFirst()); // 2
        System.out.println(dq.pollLast()); // 4

    }

    public static void main(String[] args) {
//        QueueExamples();
//        PriorityQueueExample();
//        PriorityQueueExample_Max();
        DequeueExamples();
    }
}
