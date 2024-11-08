public class Main {
    public static void main(String[] args) {
        System.out.println("Операторы");

        // Условные операторы

        // Задача 1

        int age = 17;
        if (age >= 18) {
            System.out.println("Если возвраст человека равен " + age + " лет, то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возвраст человека равен " + age + " лет, то он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача 2

        int airTemperature = 5;
        if (airTemperature >= 5) {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
        }
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        }

        // Задача 3

        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }

        // Задача 4

        int years = 25;
        if (years >= 2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + " лет, то ему нужно ходить в детский сад");
        }
        if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека равен " + years + " лет, то ему нужно ходить в школу");
        }
        if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + " лет, то его место в университете");
        }
        if (years > 24) {
            System.out.println("Если возраст человека равен " + years + " лет, то ему пора ходить на работу");
        }

        // Задача 5

        int childAge = 15;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + " лет, то ему нельзя кататься на аттракционе");
        }
        if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " лет, то ему можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " лет, то ему можно кататься без сопровождения взрослого");
        }

        // Задача 6

        int wagonCapacity = 101;
        if (wagonCapacity <= 60) {
            System.out.println("Есть сидячие места");
        } else if (wagonCapacity > 60 && wagonCapacity < 102) {
            System.out.println("Есть стоячие места");
        } else {
            System.out.println("Нет мест");
        }

        // Задача 7

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && two > three) {
            System.out.println("Число one больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Число two больше остальных");
        } else {
            System.out.println("Число three больше остальных");
        }

        // Конец
    }
}