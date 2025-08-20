
public class Monster extends Character {
    private final int maxHealth;
    private final String name;
    public Monster(String name, int maxHealth, Weapon weapon){
        super(name, maxHealth,weapon);
        this.name = name;
        this.maxHealth = maxHealth;
    }
    @Override
    public String toString(){
        if(getCurrentHealth() != 0){
            return String.format("%s is a monster with %d HP. %s", this.name, getCurrentHealth(), Weapon.toString());
        }else{
            return String.format("%s is a monster and is dead. %s", name, Weapon.toString());
        }
    }
    public void attack(Character c) {
        if(Weapon.getDamage() == null){
            c.takeDamage(7);
        }else {
            c.takeDamage(Weapon.getDamage());
        }
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