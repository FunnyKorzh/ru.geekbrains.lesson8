package ru.geekbrains.lesson8;

public class Cat implements RunAndJump {
    int maxHeight;
    int maxLength;
    String name;

    public Cat(int maxHeight, int maxLength, String name) {
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
        System.out.println("Котик прыгает");
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Котик бежит");
    }

    @Override
    public String toString() {
        return "Кот по кличке " + name;
    }
}
