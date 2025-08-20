public class Weapon {
    private final String name;
    protected final int damage;
    public Weapon(String name, int damage){
        this.name = name;
        this.damge = damage;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return  String.format("%s deals %d damages", name, damage);
    }
}