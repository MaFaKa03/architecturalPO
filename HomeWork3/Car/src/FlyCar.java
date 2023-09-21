import java.awt.*;

public class FlyCar extends Car{

    public FlyCar(String manufacture, String model,
                  TypeCar body, int wheels, TypeFuel fuel,
                  TypeGearBox transmissionBox, double value, Color color) {
        super(manufacture, model, body, wheels, fuel, transmissionBox, value, color);
    }

    public void move() {

    }

    @Override
    public void setWheels(int wheels) {
        super.setWheels(3);
    } //в любом случае будет 3 колеса

    private void fly(){}

}
