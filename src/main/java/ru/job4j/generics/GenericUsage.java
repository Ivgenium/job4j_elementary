package ru.job4j.generics;

import java.util.*;

public class GenericUsage {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add("first");
//        list.add("second");
//        list.add("third");
//        Object o = list.get(1);
//        List list = new ArrayList();
//        list.add("first");
//        list.add("second");
//        list.add(3);
//        list.add(new Person("name", 21, new Date(913716000000L)));
//        new GenericUsage().printResult(list);
//        Queue<String> temp = new ArrayDeque<>();
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        new GenericUsage().printResult(list);

//        List<Person> per = List.of(new Person("name", 21, new Date(913716000000L)));
//        new GenericUsage().printInfo(per);
//
//        List<Programmer> pro = List.of(new Programmer("name123", 23, new Date(913716000000L)));
//        new GenericUsage().printInfo(pro);
//
//        List<JavaProgrammer> javaPro = List.of(new JavaProgrammer("name456", 25, new Date(913717000000L)));
//        new GenericUsage().printInfo(javaPro);
    }

    public void printResult(Collection<?> collection) {
        for (Iterator<?> iterator = collection.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }

    public void printInfo(Collection<? extends Person> collection) {
        for (Iterator<? extends Person> iterator = collection.iterator(); iterator.hasNext();) {
            Person next = iterator.next();
            System.out.println(next);
        }
    }
}