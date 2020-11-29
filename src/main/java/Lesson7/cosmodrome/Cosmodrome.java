package Lesson7.cosmodrome;

public class Cosmodrome {
    public static void main(String[] args) throws InterruptedException {
        Space space = new Space();
        while (space.cheсkSystem() == false) {
            System.out.println("Идет заправка");
            Thread.sleep(500);
        }
        space.engineStart();
        space.start();
        Shuttle shuttle = new Shuttle();
        if (shuttle.cheсkSystem() == false) {
            System.out.println("\nПредстартовая проверка Шатла провалена");
        } else {
            shuttle.engineStart();
            shuttle.start();
        }
        System.out.println();
        Spaceship spaceship = new Spaceship();
        if (spaceship.cheсkSystem() == false) {
            System.out.println("\nПредстартовая проверка Космолета провалена");
        } else {
            spaceship.engineStart();
            spaceship.start();
        }
    }
}
