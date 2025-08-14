public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;
    public static final double KM_IN_ONE_AU = 150_000_000.0;

    public CelestialObject() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
        name = "Soleil";
    }

    public CelestialObject(String n, double x1, double y1, double z1) {
        name = n;
        x = x1;
        y = y1;
        z = z1;
    }

    public double getX() {
        return x;
    }

    public void setX(double x1) {
        x = x1;
    }

    public double getY() {
        return y;
    }

    public void setY(double y1) {
        y = y1;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z1) {
        z = z1;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public static double getDistanceBetween(CelestialObject one, CelestialObject two) {
        double dx = two.getX() - one.getX();
        double dy = two.getY() - one.getY();
        double dz = two.getZ() - one.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public static double getDistanceBetweenInKm(CelestialObject one, CelestialObject two) {
        double dx = two.getX() - one.getX();
        double dy = two.getY() - one.getY();
        double dz = two.getZ() - one.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz) * KM_IN_ONE_AU;
    }

    public String toString(){
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", name, x, y, z);
    }
    public boolean equals(CelestialObject obj){
        return x == obj.x && y ==obj.y && z == obj.z && name == obj.name;
    }
    public int hashCode(){
        return this.hashCode();
    }
}
