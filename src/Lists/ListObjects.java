package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListObjects {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("f");
        list.add("e");
        list.add("0");
        list.add(null);
        System.out.println("list = " + list);
        List<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("c");
        linked.add("e");
        linked.add("d");
        linked.add(null);
        System.out.println("linked = " + linked);
        //linked.addFirst("x");
        ((LinkedList)linked).addFirst("x");
        System.out.println("linked = " + linked);
    }
}
