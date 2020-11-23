package Lesson6;

public class Mechanisms {
    public static void main(String[] args) {
//        PassengerCar audi = new PassengerCar();
//        audi.passengerCar();
//        audi.road();
        FreightCar scania = new FreightCar();
        scania.freightCar();
        scania.cargo();
    }

    public static class Transport {
        int power;
        int maxSpeed;
        int weight;
        String carBrand;
    }
}
