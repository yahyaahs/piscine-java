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
        if(c.currentHealth+ healCapacity > c.getMaxHealth()){
            return;
        }
        c.currentHealth += healCapacity;
    }
    @Override
    public String toString(){
        if(this.getCurrentHealth() == 0){
            return String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.name, this.getCurrentHealth(), healCapacity);
        }else{
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.name);
        }
    }
}