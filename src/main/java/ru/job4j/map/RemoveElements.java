package ru.job4j.map;

import java.util.*;

public class RemoveElements {
    public static Map<Integer, String> removeElement(Map<Integer, String> data,
                                                     List<Integer> ids,
                                                     List<User> users) {
        Set<Integer> temp = new HashSet<>();
        temp.addAll(ids);
        for (User user : users) {
            for (Map.Entry<Integer, String> entry : data.entrySet()) {
                if (entry.getValue().equals(user.getName())) {
                    temp.add(entry.getKey());
                }
            }
        }
        for (Integer id : temp) {
            data.remove(id);
        }
//        for (User user : users) {
//
//        }
//        for (User user : users) {
//            Set<Map.Entry<Integer, String>> entrySet = data.entrySet();
//            Iterator<Map.Entry<Integer, String>> setIterator = entrySet.iterator();
//            while (setIterator.hasNext()) {
//                Map.Entry<Integer, String> entry = setIterator.next();
//                if (entry.getValue().equals(user.getName())) {
//                    setIterator.remove();
//                }
//            }
//        }
        return data;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return id == user.id && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}
