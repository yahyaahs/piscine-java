package Factory;

public class Plane extends Transport {
    int distance;

    public Plane(int distance){
        this.distance = distance;
    }
    @Override
    public int getDistance(){
        return distance;

    }
}