import java.util.*;

public class Galaxy {

    private List<CelestialObject> celestialObjects;

    public Galaxy(){
        celestialObjects = new ArrayList<CelestialObject>();
    }
    public List<CelestialObject> getCelestialObjects(){
        return celestialObjects;
    }
    public void addCelestialObject(CelestialObject obj){
        celestialObjects.add(obj);
    }
    public Map<String, Integer> computeMassRepartition(){
        Map<String, Integer> map = new HashMap<>();
        for(CelestialObject obj: celestialObjects){
            if(obj instanceof Star){
                map.put("Star",map.get("Star")+ obj.getMass());
            }else if( obj instanceof Planet){
                map.put("Planet",map.get("Planet")+ obj.getMass());

            }else{
                map.put("Other",map.get("Other")+ obj.getMass());

            }
        }
        return map;
    }
}