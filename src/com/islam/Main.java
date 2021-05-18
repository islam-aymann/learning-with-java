package com.islam;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(0);
        list.addFirst(5);
        System.out.println(list);

        System.out.println(list.indexOf(2));
        System.out.println(list.indexOf(5));
        System.out.println(list.size());
        System.out.println(Arrays.toString(list.toArray()));
    }


}
