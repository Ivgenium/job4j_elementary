package ru.job4j.io;

import java.util.LinkedList;
import java.util.StringJoiner;

public class Shell {
    private LinkedList<String> list = new LinkedList<>();

    public void cd(String path) {
        if (path.contains("local")) {
            StringJoiner stringJoiner = new StringJoiner("/", "/", "");
            stringJoiner.add(list.peekLast());
            stringJoiner.add(path);
            list.add(stringJoiner.toString());
        } else if (path.contains("..")) {
            StringJoiner stringJoiner = new StringJoiner("/", "/", "");
            String[] temp = path.split("/");
            for (String element : temp) {
                if (!element.equals("..")) {
                    stringJoiner.add(element);
                }
            }
            list.add(stringJoiner.toString());
        } else {
            list.add(path);
        }
    }

    public String pwd() {
        return list.pollLast();
    }
}
