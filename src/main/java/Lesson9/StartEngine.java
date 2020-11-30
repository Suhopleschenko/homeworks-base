package Lesson9;

public class StartEngine {
    public static void main(String[] args) throws FailStartException {
        Car opel = new Car("Opel", 260, 15000);
        try {
            opel.start();
        } catch (FailStartException e) {
            System.out.println(e.getMessage());
        }
        Car audi = new Car();
        audi.brand = "Audi";
        try {
            audi.start();
        } catch (FailStartException e) {
            System.out.println(e.getMessage());
        }
    }
}
