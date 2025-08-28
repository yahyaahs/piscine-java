
public class TransportFactory {

    public static int getTransport(String name){
        if(name.equals("Car")){
            return 600;
        }
        return 10000;

    }

    public static void main(String[] args)  {

        System.out.println(DriverFactory.getDriver("Car").createTransport().getDistance());
        System.out.println(DriverFactory.getDriver("Plane").createTransport().getDistance());
    }
}

