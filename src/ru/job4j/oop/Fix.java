package ru.job4j.oop;

public class Fix {
    private String desc;

    public Fix(String some) {
        this.desc = some;
    }

    public static void main(String[] args) {
        String like = "This needs to be fixed.";
        Fix joy = new Fix(like);
        System.out.println(like);
    }
}
