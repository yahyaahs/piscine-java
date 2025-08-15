package StarGalaxy;
import java.util.ArrayList;
import java.util.List;

public class Galaxy {

    private List<CelestialObject> celestialObjects;
    
    public Galaxy(){
        celestialObjects = new ArrayList<CelestialObject>();
    }
    public List<CelestialObject> getCelestianObjects(){
        return celestialObjects;
    }
    public void addCelestialObject(CelestialObject obj){
        celestialObjects.add(obj);
    }
}