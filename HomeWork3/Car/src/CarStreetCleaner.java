import java.awt.*;

public abstract class CarStreetCleaner extends Car {


    public CarStreetCleaner(String manufacture, String model,
                            TypeCar body, int wheels, TypeFuel fuel,
                            TypeGearBox transmissionBox, double value, Color color) {
        super(manufacture, model, body, wheels, fuel, transmissionBox, value, color);
    }

    public void streetCleaner(){}

    /** Этот класс отвечает сразу принципу SRP и OCP, так как класс Car  остается неизменным,
    но модифицирующимся, так как мы можем создать и стандартный автомобиль, так же можем создать автомобиль
     с ф-цией уборки улицы. Абстрактый класс CarStreetCleaner же отвечает только за одну
     ф-цию - уборка.
     **/
}
