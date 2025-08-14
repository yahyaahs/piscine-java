public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;

    public CelestialObject(){
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
    }
    public CelestialObject(String n, double x1 , double y1, double z1){
        name = n;
        x = x1;
        y= y1;
        z = z1;
    }

}
