package com.company;

abstract class Factory {
    public abstract FactoryMethod createTransport();//вернет обьект
}
class SwimFactory extends Factory {
    public Boat createTransport() {
        return new Boat();//создаем обьект в методе
    }
}
class DriveFactory extends Factory {
    public Car createTransport() {
        return new Car();
    }
}
class AirFactory extends Factory {
    public Airplane createTransport() {
        return new Airplane();
    }
}
abstract class FactoryMethod {
    public abstract void getInformation();
}
class Boat extends FactoryMethod {
    @Override
    public void getInformation() {
        System.out.println("Лодка");
    }
}
class Airplane extends FactoryMethod {
    @Override
    public void getInformation() {
        System.out.println("Самолет");
    }
}
class Car extends FactoryMethod {
    @Override
    public void getInformation() {
        System.out.println("Машина");
    }
}
public class Main {

    public static void main(String[] args) {
        Factory wuw = new AirFactory();
        Factory pup = new SwimFactory();
        Factory tut = new DriveFactory(); //создание фабрики
        FactoryMethod air = wuw.createTransport(); //при помощи фабрик создаем новый транспорт
        FactoryMethod lodka = pup.createTransport();
        FactoryMethod car = tut.createTransport();
        air.getInformation();
        lodka.getInformation();
        car.getInformation();
    }
}
