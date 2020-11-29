package Lesson7.human.HPants;

import Lesson7.human.HumanNew;

public class Shorts implements Pants {
    HumanNew.Human human = new HumanNew.Human();
    String pants = human.setJacket("abibas");

    public void putOn() {
        System.out.println("надел шорты " + pants);
    }

    public void takeOff() {
        System.out.println("снял шорты " + pants);
    }
}
