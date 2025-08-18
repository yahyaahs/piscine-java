public class Character {
    public final int maxHealth;
    public int currentHealth;
    public final String name;


    public Character(String name, int maxHealth){
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }
    public int getmaxHealth(){
        return maxHealth;
    }
    public int getcurrentHealth(){
        return currentHealth;
    }
    public String getName(){
        return name;
    }
    public void takeDamage(int sub){
        if(currentHealth - sub < 0){
            return;
        }else{
            currentHealth = currentHealth - sub;
        }
    }
    public void attack(Character c){
        c.takeDamage(9);
    }
    public String toString(){
        if (currentHealth == 0){
            return String.format("%s : KO", name);
        }
        return String.format("%s : %d/%d", name, currentHealth, maxHealth);
    }
}