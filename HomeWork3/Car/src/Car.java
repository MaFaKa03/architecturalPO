import java.awt.*;

public abstract class Car{
    private final String manufacture;
    private final String model;
    private final TypeCar body;
    private int wheels;
    private final TypeFuel fuel;
    private final TypeGearBox transmissionBox;
    private final double value;
    private final Color color;

    public Car(String manufacture, String model, TypeCar body, int wheels,
               TypeFuel fuel, TypeGearBox transmissionBox, double value, Color color) {
        this.manufacture = manufacture;
        this.model = model;
        this.body = body;
        this.wheels = wheels;
        this.fuel = fuel;
        this.transmissionBox = transmissionBox;
        this.value = value;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", body='" + body + '\'' +
                ", fuel='" + fuel + '\'' +
                ", transmissionBox='" + transmissionBox + '\'' +
                ", value=" + value + ", ";
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public TypeCar getBody() {
        return body;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public TypeFuel getFuel() {
        return fuel;
    }

    public TypeGearBox getTransmissionBox() {
        return transmissionBox;
    }

    public double getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public abstract void move(); //метод делаем абстрактным, чтобы для каждой машины способ
                                    //передижения опредяли сам как в классе FlyCar или MyCar
                                //Таким образом поддерживается принцип LSP
    public void transmissionTurn(){}
    public void maintenance(){}
    public void headlightTurn(){}
    public void wipersTurn(){}
}
