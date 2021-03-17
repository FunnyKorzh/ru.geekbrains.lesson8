package ru.geekbrains.lesson8;

public enum Day {
    MONDAY(8,17), TUESDAY(8, 17),
    WEDNESDAY(8, 17), THURSDAY(8, 16),
    FRIDAY (9, 15), SATURDAY, SUNDAY;

    int beginDayHour;
    int endDayHour;

    Day(int beginDayHour, int endDayHour) {
        this.beginDayHour = beginDayHour;
        this.endDayHour = endDayHour;
    }

    Day() {
        this(0, 0);
    }

    static int getTodayWorkingHours(Day day) {
        int result = day.endDayHour - day.beginDayHour;
        return (result >= 0) ? result : 0;
    }

    static String getWorkingHours(Day day) {
        if (getTodayWorkingHours(day) == 0) {
            return "Сегодня выходной";
        }

        int result = 0;
        for (int i = day.ordinal(); i < Day.values().length; i++) {
            result += Day.getTodayWorkingHours(Day.values()[i]);
        }

        return "До конца недели осталось поработать " + result + " часов";
    }
}
