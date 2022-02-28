package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        list.addLast("E");
        System.out.println("LL: "+list);
        list.addFirst("A");
        System.out.println("LL: "+list);

        System.out.println("Index of element with value E: "+list.get("E"));
        System.out.println("Index of element with value ZZZ: "+list.get("ZZZ"));

        list.remove("C");
        System.out.println("LL: "+list);



    }
}
