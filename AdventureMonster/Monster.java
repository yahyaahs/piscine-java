
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
}