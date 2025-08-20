public class Weapon {
    private final String name;
    protected final int damge;
    public Weapon(String name, int damage){
        this.name = name;
        this.damge = damage;
    }

    public static int getDamge() {
        return damge;
    }

    public static String getName() {
        return name;
    }
    public static String toString(){
        return  String.format("%s deals %d damages", name, damge);
    }
}