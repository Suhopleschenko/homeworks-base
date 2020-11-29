package Lesson7.human.HFootwear;

import Lesson7.human.HumanNew;

public class Boots implements Footwear {
    HumanNew.Human alex = new HumanNew.Human();
    String footwear = alex.setFootwear("camelot");

    public void putOn() {
        System.out.println(" надел ботинки " + footwear);
    }

    public void takeOff() {
        System.out.println(" снял ботинки " + footwear);
    }
}
