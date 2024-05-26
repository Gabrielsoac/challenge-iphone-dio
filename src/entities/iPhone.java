package entities;

abstract class iPhone {

    String MAC;
    String model;
    Double RAM;
    Double storagement;

    iPhone(String MAC, String model, Double RAM, Double storagement) {
        this.MAC = MAC;
        this.model = model;
        this.RAM = RAM;
        this.storagement = storagement;
    }

    abstract void turnOn();
    abstract void turnOff();
}
