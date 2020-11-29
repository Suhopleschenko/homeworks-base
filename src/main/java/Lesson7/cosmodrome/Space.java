package Lesson7.cosmodrome;

import java.util.Random;

public class Space implements IStart {
    @Override
    public boolean cheсkSystem() {
        Random random = new Random();
        boolean check = true;
        int a = random.nextInt(3);
        if (a != 0) {
            check = false;
        }
        return check;
    }

    @Override
    public void engineStart() {
        System.out.println("Идет построение маршрута");
    }

    @Override
    public void start() {
        System.out.println("\nМаршрут построен. Начинаем предстартовую проверку");
    }

}
