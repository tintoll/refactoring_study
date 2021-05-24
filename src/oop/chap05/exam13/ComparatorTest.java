package oop.chap05.exam13;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>(new MyCompare());
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");

        System.out.println(set);

    }
}
