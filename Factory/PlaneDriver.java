public class PlaneDriver extends Driver {
    
    @Override
    public Transport createTransport(){
        int distance = TransportFactory.getTransport("plane");
        return new Plane(distance);
    }
}