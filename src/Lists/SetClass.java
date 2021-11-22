package Lists;

import java.util.*;

public class SetClass {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,23,434,534,5345,52,123,312,312,2);


        Set<String > hashSet=new HashSet<>();
        hashSet.add(null);
        hashSet.add("hello");
        hashSet.add("$4.0");
        hashSet.add("100");
        hashSet.add("hello");
        hashSet.add("%");

        Set<String > linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(null);
        linkedHashSet.add("hello");
        linkedHashSet.add("$4.0");
        linkedHashSet.add("100");
        linkedHashSet.add("hello");
        linkedHashSet.add("%");
        
        Set<String > treeSet=new TreeSet<>();
        //treeSet.add(null);
        treeSet.add("hello");
        treeSet.add("$4.0");
        treeSet.add("100");
        treeSet.add("hello");
        treeSet.add("%");

        System.out.println("hashSet = " + hashSet);
        System.out.println("linkedHashSet = " + linkedHashSet);
        System.out.println("treeSet = " + treeSet);

    }
}
