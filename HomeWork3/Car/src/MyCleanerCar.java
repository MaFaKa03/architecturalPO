import java.awt.*;

public class MyCleanerCar extends CarStreetCleaner implements Gasoline{


    public MyCleanerCar(String manufacture, String model,
                        TypeCar body, int wheels, TypeFuel fuel,
                        TypeGearBox transmissionBox, double value, Color color) {
        super(manufacture, model, body, wheels, fuel, transmissionBox, value, color);
    }

    @Override
    public void move() {
    }

    @Override
    public void transmissionTurn(){}
    @Override
    public void headlightTurn(){}
    @Override
    public void wipersTurn(){}
    @Override
    public void streetCleaner(){}

    @Override
    public void Gas() {

    }
}
