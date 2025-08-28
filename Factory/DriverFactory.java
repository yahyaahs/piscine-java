import java.sql.Driver;

public class DriverFactory {

    public Driver getDriver(String name) {
        if (name.equals("car")) {
            return new carDriver();
        } else if (name.equals("plane")) {
            return 10000;
        }
    }
}