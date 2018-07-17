package com.codingblocks;

public class Human implements Comparable<Human> {

    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }

    @Override
    public int compareTo(Human o) {
        return - this.name.compareTo(o.name);
    }
}
