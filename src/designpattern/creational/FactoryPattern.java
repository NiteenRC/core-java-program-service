package designpattern.creational;

enum CarType {
    SMALL, SEDAN
}

public class FactoryPattern {
    public static void main(String[] args) throws Exception {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));

    }
}

abstract class Car {
    private CarType carType;

    public Car(CarType carType) {
        this.carType = carType;
    }

    public abstract void construct();

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                '}';
    }
}

class SmallCar extends Car {

    public SmallCar() {
        super(CarType.SMALL);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Construct SMALL car");
    }
}

class SedanCar extends Car {

    SedanCar() {
        super(CarType.SEDAN);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Construct SEDAN car");
    }
}

class CarFactory {
    public static Car buildCar(CarType carType) throws Exception {
        Car car = null;
        switch (carType) {
            case SMALL: {
                car = new SmallCar();
                break;
            }
            case SEDAN: {
                car = new SedanCar();
                break;
            }
            default: {
                throw new Exception("Unable to create car");
            }
        }
        return car;
    }
}

