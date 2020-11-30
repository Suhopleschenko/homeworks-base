package Lesson9;

import java.util.Random;

public class Car {
    private String brand;
    int speed;
    int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public void start() throws FailStartException {
        Random random = new Random();
        int a = random.nextInt(21);
        if (a % 2 == 0) {
            throw new FailStartException("error " + brand + " не завелся");
        } else {
            System.out.println(brand + " завелся");
        }
    }
}
