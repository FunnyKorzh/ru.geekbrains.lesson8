package ru.geekbrains.lesson8;

public interface Obstaclable {
    boolean toRun(int maxLength);
    boolean toJump(int maxHeight);
}