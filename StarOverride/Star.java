import java.util.Objects;

public class Star extends CelestialObject{
    private double magnitude;
    public Star(String name, double x, double y, double z, double magnitude){
        super(name, x, y, z);
        this.magnitude = magnitude;
    }
    public Star(){
        super();
        magnitude = 0.0;
    }
    public void setMagnitude(double m){
        magnitude = m;
    }
    public double getMagnitude(){
        return magnitude;
    }
  
    @Override
    public String toString(){
        return String.format("%s shines at the %.3f magnitude", name, magnitude);
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        Star ob = (Star) obj;
        return Objects.equals(name, ob.name)&& Objects.equals(x, ob.x)&&Objects.equals(y, ob.y)&&Objects.equals(z, ob.z)&&Objects.equals(magnitude, ob.magnitude);
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getX(), getY(), getZ(), magnitude);
    }
}