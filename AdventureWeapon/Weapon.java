public class Weapon extends Character{
    private final String name;
    protected final int damge;
    public Weapon(String name, int damage){
        this.name = name;
        this.damge = damage;
    }

    public int getDamge() {
        return damge;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return  String.format("%s deals %d damages", name, damge);
    }
}