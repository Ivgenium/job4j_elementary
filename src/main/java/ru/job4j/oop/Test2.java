package ru.job4j.oop;

public class Test2 {
    private String name;
    private String hello;

    public Test2(String name) {
        this.name = name;
    }

    public String getHello() {
        return hello;
    }

    public static void main(String[] args) {
//        System.out.println((new Test2("name").getHello() instanceof String));
//        Test2 test2 = new Test2("Test2");
//        test2.method();
        System.out.printf("Имя: %1$s, возраст: %s", 22, "Иван");
    }

    public void method(int... nums) {
    }

    public void method(String str, int... nums) {
    }

    public void method(int num) {
    }

    public void method(String... strings) {
    }
}
