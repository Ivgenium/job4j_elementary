package ru.job4j.oop.enumeration;

public enum Status {
    ACCEPTED(1, "Принят"),
    IN_WORK(2, "В работе"),
    WAITING(3, "Ожидает клиента"),
    FINISHED(4, "Завершен");

    private final String text;
    private final int code;

    Status(int code, String text) {
        this.text = text;
        this.code = code;
    }

    public String info() {
        return text;
    }

    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        Status volga = Status.ACCEPTED;
        System.out.println("Статус Toyota: " + toyota.info());
        System.out.println("Статус Volvo: " + volvo.info());
        System.out.println("Статус Volga: " + volga.text);
    }
}
