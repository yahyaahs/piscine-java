
public class DriverFactory {


    public static Driver getDriver(String name) {
        if (name.equals("Car")) {
            return new carDriver();
        } else if (name.equals("Plane")) {
            return new PlaneDriver();
        }
        return null;
    }
}