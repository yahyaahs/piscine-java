import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centeStar;
    public Planet(){
        super();
        centeStar= new Star();        
    }
    public Planet(String name,double x,double y, double z, Star centeStar){
        super(name,x,y,z);
        this.centeStar = centeStar;
        
    }
    public Star getCenterStar(){
        return centeStar;
    }
    public void setCenterStar(Star star){
        centeStar = star;
    }
    @Override
    public String toString(){
        return String.format("%s circles around %s at the %.3f AU", name, centeStar.name, super.getDistanceBetween(this , centeStar));
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
        return Objects.equals(name, ob.name)&& Objects.equals(x, ob.x)&&Objects.equals(y, ob.y)&&Objects.equals(z, ob.z)&&Objects.equals(centeStar, ob.centeStar);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, x, y, z, centeStar);
    }
}