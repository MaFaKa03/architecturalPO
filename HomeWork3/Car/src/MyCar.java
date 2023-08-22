import java.awt.*;

public class MyCar extends Car implements Gasoline, Wiping{
    private int loadCapacity;

    public MyCar(String manufacture, String model,
                 TypeCar body, int wheels, TypeFuel fuel,
                 TypeGearBox transmissionBox, double value, Color color, int loadCapacity) {
        super(manufacture, model, body, wheels, fuel, transmissionBox, value, color);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void move() {

    }

    @Override
    public void Gas() {

    }

    @Override
    public void wipWindShield() {

    }

    @Override
    public void wipHeadLights() {

    }

    @Override
    public void wipMirrors() {

    }
}
