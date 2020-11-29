package Lesson7.cosmodrome;

public class Cosmodrome {
    public static void main(String[] args) throws InterruptedException {
        Space space = new Space();
        while (space.cheсkSystem() == false) {
            System.out.println("Идет заправка");
            Thread.sleep(500);
        }
        space.engineStart();
        int m;
        int k = 10;
        for (m = 10; m > 0; m--) {
            System.out.print(k + "%...");
            Thread.sleep(1000);
            k = k + 10;
        }
        space.start();
        Shuttle shuttle = new Shuttle();
        if (shuttle.cheсkSystem() == false) {
            System.out.println("\nПредстартовая проверка провалена");
        } else {
            shuttle.engineStart();
            int n;
            int i = 10;
            for (n = 10; n > 0; n--) {
                System.out.println(i);
                Thread.sleep(1000);
                i--;
            }
            shuttle.start();
        }
    }
}
