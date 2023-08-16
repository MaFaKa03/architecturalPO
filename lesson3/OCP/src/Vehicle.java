public abstract class Vehicle {
    private int maxSpeed;
    String type;
    public Vehicle(int maxSpeed, String type){
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    public double CalculateAllowSpeed(){
        return this.maxSpeed * 0.8;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getType() {
        return this.type;
    }
}
