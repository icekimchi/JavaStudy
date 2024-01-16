package ch08.car;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        myCar.frontLeftTire = new Kumhotire();
        myCar.frontRightTire = new Kumhotire();
    }
}
