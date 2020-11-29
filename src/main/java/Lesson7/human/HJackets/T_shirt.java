package Lesson7.human.HJackets;

import Lesson7.human.HumanNew;

public class T_shirt implements Jacket {
    HumanNew.Human human = new HumanNew.Human();
    String jacket = human.setJacket("abibas");

    public void putOn() {
        System.out.println("надел футболку " + jacket);
    }

    public void takeOff() {
        System.out.println("снял футболку " + jacket);
    }
}
