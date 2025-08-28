

public class carDriver extends Driver {
    
    @Override

    public Transport createTransport(){
        int tr = TransportFactory.getTransport("car");
        return new Car(tr);
    }
}