package Lesson7.cosmodrome;

import java.util.Random;

public class Shuttle implements IStart {
    @Override
    public boolean cheсkSystem() {
        Random random = new Random();
        boolean check = true;
        int a = random.nextInt(11);
        if (a < 4) {
            check = false;
        }
        return check;
    }

    public void engineStart() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}