package Collection_Framwork;
import java.util.*;

class Student implements Comparable<Student>{
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa  = gpa;
    }

    public String getName() { return name; }
    public double getGpa()  { return gpa; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(), this.getGpa());
    }
}

//class StringLengthComaparator implements ComparableDemo<String> {
//    public int compare(String o1, String o2) {
//        return o2.length() - o1.length();
//    }
//}
//class myComparator implements ComparableDemo<Integer> {
//    public int compare(Integer o1, Integer o2) {
//        return o2-o1;
//    }
//}



// o1     o2
// "Ok" "bye"

public class arrayList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Akshit", 3.9));

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);


        students.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa() > 0) {
                return 1;
            } else if (o2.getGpa() - o1.getGpa() < 0) {
                return -1;
            } else {
                return o2.getName().compareTo(o1.getName());
            }
        });
        for (Student s : students) {
            System.out.println(s.getName() + ": " + s.getGpa());
        }
        Collections.sort(students, comparator);



//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(5);
//        list.add(3);
//        list.add(4);
//        list.sort(new myComparator());
//        System.out.println(list);

//        System.out.println(list.get(0));
//        System.out.println(list.size());
//        for (int i=0;i<list.size();i++){
//            System.out.print(list.get(i) + " ");
//        }
//        for (int x: list) {
//            System.out.println(x);
//        }
//        System.out.println(list.contains(5));
//        System.out. println(list.contains(50));

//        list.remove(2);  first it check the element within valid range then remove
//        for (int x: list) {
//            System.out.println(x);
//        }

//        list.add(2,50);  // index and element and add the element into the list 2 index 50 element
//        for (int x: list) {
//            System.out.println(x);
//        }

//        list.set(2, 50); // this set replace the value into the 2 index = 50 element
//
//        System.out.println(list);


//        List<String> list = new ArrayList<>();
//        System.out.println(list.getClass().getName());
//
//        List<String> list1 = Arrays.asList("Monday", "Tuesday");
//        System.out.println(list1.getClass().getName());
//        list1.set(1, "wednesday");
//        System.out.println(list1.get(1));
//
//        String[] array = {"Apple", "Banana", "Cherry"};
//
//
//        List<String> list2 = Arrays.asList(array);
//        System.out.println(list2.getClass().getName());
//
//
//        List<Integer> list3 = List.of(1,2,3);
////        list3.set(); immutable
//
//        List<String> list4 = new ArrayList<>(list2);
//        list4.add("Mango");
//        System.out.println(list4);

//        List<Integer> list1 =List.of(4,5,6,7,8,9);
//        list.addAll(list1);
//        System.out.println(list);


//        list.remove(1);

//        list.remove(Integer.valueOf(1));
//        System.out.println(list);

//        Object[] array = list.toArray();
//        Integer[] array1 = list.toArray(new Integer[0]);


//        Collections.sort(list);

//        list.sort(null);
//        System.out.println(list);

//
//        List<String> words = Arrays.asList("Banana","Apple","Date");
//        words.sort(new StringLengthComaparator());
//        System.out.println(words);


    }
}
