package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {

        //HashSet
        HashSet<String> names = new HashSet<>();

        //Add elements
        names.add("Bob");
        names.add("Anna");
        names.add("Liam");

        names.add("Anna");

        //Print out all elements
        System.out.println(names);

        //remove element
        names.remove("Bob");
        System.out.println(names);

        //Size
        System.out.println(names.size());

        //contains
        System.out.println(names.contains("Liam"));
        System.out.println(names.contains("Bob"));

        //Iterate
        for(String str : names){
            System.out.println(str);
        }

       /* Iterator<String> i = names.iterator();
        while(i.hasNext()){
            System.out.println(i.hasNext()); */


        //example 2
        HashSet<Integer> intSet1 = new HashSet<>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);

        System.out.println("inSet1: " + intSet1);

        HashSet<Integer> intSet2 = new HashSet<>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);

        System.out.println("inSet2: " + intSet2);

        //Find union
        HashSet<Integer> union = new HashSet<>(intSet1);
        System.out.println("union before: " + union);
        union.addAll(intSet2);
        System.out.println("union after: " + union);

        //find intersection
        HashSet<Integer> intersection = new HashSet<>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println("intersection: " + intersection);

        //find difference for intSet1
        HashSet<Integer> difference = new HashSet<>(intSet1);
        difference.removeAll(intSet2);
        System.out.println("difference for intSet1: " + difference);

        //find difference for intSet1
        HashSet<Integer> difference1 = new HashSet<>(intSet2);
        difference1.removeAll(intSet1);
        System.out.println("difference for intSet2: " + difference1);

        //all differences
        HashSet<Integer> diffAll = new HashSet<>(difference);
        diffAll.addAll(difference1);
        System.out.println("All differences: " + diffAll);

        //LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Estonia");
        linkedHashSet.add("Latvia");
        linkedHashSet.add("Italy");
        linkedHashSet.add("Sweden");

        System.out.println(linkedHashSet);
        linkedHashSet.remove("Latvia");
        System.out.println(linkedHashSet);



        }
}

