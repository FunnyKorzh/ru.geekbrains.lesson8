package ru.geekbrains.lesson8;

public class Human implements RunAndJump {
    int maxHeight;
    int maxLength;
    String name;

    public Human(int maxHeight, int maxLength, String name) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.name = name;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Человек бежит");
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Человек прыгает");
    }

    @Override
    public String toString() {
        return "Участник по имени " + name;
    }
}