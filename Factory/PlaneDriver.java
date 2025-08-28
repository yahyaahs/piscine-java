public class PlaneDriver extends Driver {
    
    @Override
    public Transport createTransport(){
        int distance = TransportFactory.getTransport("Plane");
        return new Plane(distance);
    }
}