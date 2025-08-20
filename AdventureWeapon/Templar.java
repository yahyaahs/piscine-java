public class Templar extends Character implements Healer, Tank{
    private final int healCapacity;
    private final int shield;
    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon){
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield ;
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
    public int getShield(){
        return shield;
    }
    @Override
    public String toString(){
        if(getCurrentHealth() == 0){
            return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP. %s", getName(), getShield(),getHealCapacity(), weapon.toString());
        }else{
            return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d. %s", getName(), getCurrentHealth(), getHealCapacity(), getShield(), weapon.toStirng());
        }
    }

    public void attack(Character c) {
        heal(this)  ;
        if(damage == null){
            c.takeDamage(6);
        }else {
            c.takeDamage(damage);
        }
    }
    public void takeDamage(int sub) {
        setCurrentHealth(Math.max(getCurrentHealth() - (sub- shield), 0));
    }
}