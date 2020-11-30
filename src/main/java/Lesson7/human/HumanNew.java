package Lesson7.human;

import Lesson7.human.HFootwear.Boots;
import Lesson7.human.HFootwear.Sneakers;
import Lesson7.human.HJackets.Tshirt;
import Lesson7.human.HJackets.Vest;
import Lesson7.human.HPants.Jeans;
import Lesson7.human.HPants.Shorts;

public class HumanNew {
    public static void main(String[] args) {
        Human human = new Human();
        String name = human.setName("Max");
        System.out.print(name);
        putOnAll();
        System.out.println();
        System.out.print(name);
        takeOffAll();
        System.out.println();
        String name2 = human.setName("Alex");
        System.out.print(name2);
        putOnAll2();
        System.out.println();
        System.out.print(name2);
        takeOffAll2();
    }

    public static class Human {
        String name;
        String jacket;
        String pants;
        String footwear;

        public String getName() {
            return name;
        }

        public String setName(String name) {
            this.name = name;
            return name;
        }

        public String getJacket() {
            return jacket;
        }

        public String setJacket(String jacket) {
            this.jacket = jacket;
            return jacket;
        }

        public String getPants() {
            return pants;
        }

        public String setPants(String pants) {
            this.pants = pants;
            return pants;
        }

        public String getFootwear() {
            return footwear;
        }

        public String setFootwear(String footwear) {
            this.footwear = footwear;
            return footwear;
        }
    }

    public static void putOnAll() {
        Boots boots = new Boots();
        boots.putOn();
        Vest vest = new Vest();
        vest.putOn();
        Jeans jeans = new Jeans();
        jeans.putOn();
    }

    public static void takeOffAll() {
        Boots boots = new Boots();
        boots.takeOff();
        Vest vest = new Vest();
        vest.takeOff();
        Jeans jeans = new Jeans();
        jeans.takeOff();
    }

    public static void putOnAll2() {
        Sneakers sneakers = new Sneakers();
        sneakers.putOn();
        Shorts shorts = new Shorts();
        shorts.putOn();
        Tshirt tshirt = new Tshirt();
        tshirt.putOn();
    }

    public static void takeOffAll2() {
        Sneakers sneakers = new Sneakers();
        sneakers.takeOff();
        Shorts shorts = new Shorts();
        shorts.takeOff();
        Tshirt tshirt = new Tshirt();
        tshirt.takeOff();
    }
}
