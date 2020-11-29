package Lesson7.human.HFootwear;

import Lesson7.human.HumanNew;

public class Sneakers implements Footwear {
    HumanNew.Human human = new HumanNew.Human();
    String footwear = human.setFootwear("abibas");

    public void putOn() {
        System.out.println(" надел кроссовки " + footwear);
    }

    public void takeOff() {
        System.out.println(" снял кроссовки " + footwear);
    }
}
