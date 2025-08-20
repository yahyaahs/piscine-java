
public class Monster extends Character {
    private final int maxHealth;
    private final String name;
    public Monster(String name, int maxHealth){
        super(name, maxHealth);
        this.name = name;
        this.maxHealth = maxHealth;
    }
    @Override
    public String toString(){
        if(getCurrentHealth() != 0){
            return String.format("%s is a monster with %d HP", this.name, getCurrentHealth());
        }else{
            return String.format("%s is a monster and is dead", name);
        }
    }
    public void attack(Character c) {
        c.takeDamage(7);
    }
    public void takeDamage(int sub) {
        if (getCurrentHealth() - sub < 0) {
            setCurrentHealth(0);
        } else {
            int reducedDamage = (int) Math.floor(sub * 0.8);
            setCurrentHealth(getCurrentHealth() - reducedDamage);
        }
    }

}