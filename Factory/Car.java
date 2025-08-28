
public class Car implements Transport{

    int distance;
    public Car(int distance){
        this.distance = distance;

    }
    @Override
    public int getDistance(){
        return distance;
    }
}