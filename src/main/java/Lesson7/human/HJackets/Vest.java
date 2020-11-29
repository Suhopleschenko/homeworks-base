package Lesson7.human.HJackets;

import Lesson7.human.HumanNew;

public class Vest implements Jacket {
    HumanNew.Human human = new HumanNew.Human();
    String jacket = human.setJacket("camelot");

    public void putOn() {
        System.out.println("надел жилет " + jacket);
    }

    public void takeOff() {
        System.out.println("снял жилет " + jacket);
    }
}
