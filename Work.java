package ru.geekbrains.lesson8;

public class Work {
    public static void main(String[] args) {
        RunAndJump[] members = {
                new Human(4, 5, "Владимир"),
                new Human(1, 2, "Денис"),
                new Cat(7, 8, "Джеки Чан"),
                new Cat(9, 9, "Чак Норрис"),
                new Robot(2, 3, 7),
                new Robot(4,7,4)
        };

        Obstaclable[] obstacles = {
                new RunTrack(1),
                new RunTrack(4),
                new Wall(1),
                new Wall(3)
        };

        for (RunAndJump member : members) {
            System.out.println("К прохождению препятствий приступает " + member);
            boolean winner = true;
            for (Obstaclable obstacle : obstacles) {
                System.out.println(member + " пробует пройти " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("Он проходит!");
                } else {
                    winner = false;
                    System.out.println("Ехх, не получилось!");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " прошёл дистанцию!");
            } else {
                System.out.println(member + " проиграл.");
            }
            System.out.println();
        }
    }
}