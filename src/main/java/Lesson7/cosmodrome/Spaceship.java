package Lesson7.cosmodrome;

import java.util.Random;

public class Spaceship implements IStart {
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

    public void engineStart() throws InterruptedException {
        System.out.println("Двигатели Космолета запущены. Все системы в норме.");
        int n;
        int i = 10;
        for (n = 10; n > 0; n--) {
            System.out.print(i + "...");
            Thread.sleep(500);
            i--;
        }
    }

    @Override
    public void start() {
        System.out.println("\nВзлет Космолета");
    }
}
