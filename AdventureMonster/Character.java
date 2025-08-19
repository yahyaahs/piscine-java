import java.util.List;
import java.util.ArrayList;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<Character>();

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        allCharacters.add(this);
    }

    public static String printStatus() {
        if (allCharacters.size() == 0) {
            return "------------------------------------------\nNobody's fighting right now !\n------------------------------------------\n";

        } else {
            String holder = "------------------------------------------\nCharacters currently fighting :\n";
            for (Character c : allCharacters) {
                holder += String.format(" - %s\n", c.toString());
            }
            holder += "------------------------------------------\n";
            return holder;

        }
    }
    public static Character fight(Character p1, Character p2) {
        while (p1.currentHealth > 0 && p2.currentHealth > 0) {
            p1.attack(p2);
            if (p2.currentHealth != 0) {
                p2.attack(p1);

            }
        }
        if (p1.currentHealth != 0) {
            return p1;
        } else {
            return p2;
        }
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int sub) {
        if (currentHealth - sub < 0) {
            currentHealth = 0;
        } else {
            currentHealth = currentHealth - sub;
        }
    }

    public void attack(Character c) {
        c.takeDamage(9);
    }

    public String toString() {
        if (currentHealth == 0) {
            return String.format("%s : KO", name);
        }
        return String.format("%s : %d/%d", name, currentHealth, maxHealth);
    }
}