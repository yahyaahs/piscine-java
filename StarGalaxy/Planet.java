import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centerStar;
    public Planet(){
        super();
        centerStar= new Star();        
    }
    public Planet(String name,double x,double y, double z, Star centerStar){
        super(name,x,y,z);
        this.centerStar = centerStar;
        
    }
    public Star getCenterStar(){
        return centerStar;
    }
    public void setCenterStar(Star star){
        centerStar = star;
    }
    @Override
    public String toString(){
        return String.format("%s circles around %s at the %.3f AU", name, centerStar.name, super.getDistanceBetween(this , centerStar));
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Planet ob = (Planet) obj;
        return Objects.equals(name, ob.name)&& Objects.equals(x, ob.x)&&Objects.equals(y, ob.y)&&Objects.equals(z, ob.z)&&Objects.equals(centerStar, ob.centerStar);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, x, y, z, centerStar);
    }
}