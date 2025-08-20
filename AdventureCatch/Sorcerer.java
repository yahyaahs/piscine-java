public class Sorcerer extends Character implements Healer {
    private final String name;
    private final int maxHealth;
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.name = name;
        this.maxHealth = maxHealth;
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public void heal(Character c)throws DeadCharacterException {
                   if(super.getCurrentHealth()== 0){
            throw new DeadCharacterException(this);
        }
        if(c.getCurrentHealth()+ healCapacity > c.getMaxHealth()){
            c.setCurrentHealth(c.getMaxHealth());
            return;
        }
        c.setCurrentHealth(c.getCurrentHealth()+ healCapacity);
    }

    @Override
    public String toString() {
        if (getCurrentHealth() != 0) {
            return String.format("%s is a sorcerer with %d HP. It can heal %d HP. %s", this.name,
                    this.getCurrentHealth(), healCapacity, super.getWeapon().toString());
        } else {
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP. %s", this.name, this.healCapacity,
                    super.getWeapon().toString());
        }
    }

    public void attack(Character c) throws DeadCharacterException {
                   if(super.getCurrentHealth()== 0){
            throw new DeadCharacterException(this);
        }
        heal(this);
        if(super.getWeapon() == null){
            c.takeDamage(10);
        }else {
            c.takeDamage(super.getWeapon().getDamage());
        }
    }

    public void takeDamage(int sub) throws DeadCharacterException{
                   if(super.getCurrentHealth()== 0){
            throw new DeadCharacterException(this);
        }
        setCurrentHealth(Math.max(getCurrentHealth() - sub, 0));
    }
}