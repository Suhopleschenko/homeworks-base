package Lesson7.robot;

import Lesson7.robot.hands.SamsungHand;
import Lesson7.robot.hands.SonyHand;
import Lesson7.robot.hands.ToshibaHand;
import Lesson7.robot.heads.SamsungHead;
import Lesson7.robot.heads.SonyHead;
import Lesson7.robot.heads.ToshibaHead;
import Lesson7.robot.legs.SamsungLeg;
import Lesson7.robot.legs.SonyLeg;
import Lesson7.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        robot1.setHead(new SamsungHead(500));
        robot1.setHand(new SonyHand(300));
        robot1.setLeg(new ToshibaLeg(400));
        robot1.action();
        System.out.println("Стоимость робота №1: " + robot1.getPrice());
        System.out.println();

        Robot robot2 = new Robot();
        robot2.setHead(new SonyHead(700));
        robot2.setHand(new ToshibaHand(250));
        robot2.setLeg(new SamsungLeg(300));
        robot2.action();
        System.out.println("Стоимость робота №2: " + robot2.getPrice());
        System.out.println();

        Robot robot3 = new Robot();
        robot3.setHead(new ToshibaHead(600));
        robot3.setHand(new SamsungHand(200));
        robot3.setLeg(new SonyLeg(500));
        robot3.action();
        System.out.println("Стоимость робота №3: " + robot3.getPrice());
        System.out.println();
        System.out.println(robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice() ? "Робот №1 самый дорогой" :
                robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice() ? "Робот №2 самый дорогой" :
                        "Робот №3 самый дорогой");
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


    }
}
