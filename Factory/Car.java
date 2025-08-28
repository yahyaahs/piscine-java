
public class Car extends Transport{

    int distance;
    public Car(int distance){
        this.distance = distance;

    }
    @Override
    public int getDistance(){
        return distance;
    }
}