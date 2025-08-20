public class Sorcerer extends Character implements Healer  {
    private final String name;
    private final int maxHealth;
    private final int healCapacity;
    public Sorcerer(String name, int maxHealth, int healCapacity){
        super(name, maxHealth);
        this.name = name;
        this.maxHealth = maxHealth;
        this.healCapacity = healCapacity;
    }
    @Override
    public int getHealCapacity(){
        return healCapacity;
    }
    @Override
    public void heal(Character c){
        if(c.getCurrentHealth()+ healCapacity > c.getMaxHealth()){
            c.setCurrentHealth(c.getMaxHealth());
            return;
        }
        c.setCurrentHealth(c.getCurrentHealth()+ healCapacity);
    }

    @Override
    public String toString(){
        if(getCurrentHealth() != 0){
            return String.format("%s is a sorcerer with %d HP. It can heal %d HP. %s", this.name, this.getCurrentHealth(), healCapacity, weapon.toString());
        }else{
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP. %s", this.name, this.healCapacity, weapon.toString());
        }
    }
    public void attack(Character c) {
        heal(this);
        if(weapon == null){
            c.takeDamage(10);
        }else {
            c.takeDamage(weapon.getDamage());
        }
    }
    public void takeDamage(int sub) {
        setCurrentHealth(Math.max(getCurrentHealth() - sub, 0));
    }
}