package com.company;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
MyLinkedList list = new MyLinkedList();
        list.add("12345");
        list.add("dwead");
        list.add("dwqa1");
        list.add("12345");
        list.add("dwead");
        list.add("dwqa2");
        list.add(2, "-----");
        System.out.println(list.get(2));
       // list.remove(2);
        System.out.println(list);



    }
}
