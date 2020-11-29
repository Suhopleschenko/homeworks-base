package Lesson7.human.HPants;

import Lesson7.human.HumanNew;

public class Jeans implements Pants {
    HumanNew.Human human = new HumanNew.Human();
    String pants = human.setJacket("camelot");

    public void putOn() {
        System.out.println("надел джинсы " + pants);
    }

    public void takeOff() {
        System.out.println("снял джинсы " + pants);
    }
}
