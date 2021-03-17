package ru.geekbrains.lesson8;

public class RunTrack implements Obstaclable {
    int length;

    public RunTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean toRun(int maxLength) {
        return (maxLength >= length);
    }

    @Override
    public boolean toJump(int maxHeight) {
        return false;
    }

    @Override
    public String toString() {
        return "беговую дорожку длиной " + length + " метр/а";
    }
}
