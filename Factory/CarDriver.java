

public class CarDriver extends Driver {
    
    @Override
    public Transport createTransport(){
        int tr = TransportFactory.getTransport("Car");
        return new Car(tr);
    }
}