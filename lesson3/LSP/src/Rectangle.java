public class Rectangle extends QuadRangle{
    protected int weight;
    protected int height;
    public Rectangle(int weight, int height){
        this.height = height;
        this.weight = weight;
    }
    @Override
    public int area(){
        return weight * height;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
