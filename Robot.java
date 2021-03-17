package ru.geekbrains.lesson8;

public class Robot implements RunAndJump {
    int maxHeight;
    int maxLength;
    int Number;

    public Robot(int maxHeight, int maxLength, int Number) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.Number = Number;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Робот бежит");
    }

    @Override
    public String toString() {
        return "Робот № " + Number;
    }
}
