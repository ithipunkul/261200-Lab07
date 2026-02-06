public class Character {
    private int health ;
    private int stamina ;
    private final int maxHealth ;
    private final int maxStamina ;

    Character(int maxHealth,int maxStamina) {
        this.maxHealth = maxHealth;
        this.maxStamina = maxStamina;
        this.health = maxHealth;
        this.stamina = maxStamina;
        System.out.println("Character created with "+this.health+" health and "+this.stamina+" stamina.");
    }
    public int getHealth() {return this.health;}
    public int getStamina() {return this.stamina;}

    public void swingSword() {
        if (this.stamina > 0) {
            this.stamina -= 10;
        }

        // Using the getter to check the current state for the print message
        if (getStamina() <= 0) {
            this.stamina = 0;
            System.out.println("Character swings the sword. Stamina is now " + getStamina() + ".");
            System.out.println("Your character needs to cool down.");
        } else {
            System.out.println("Character swings the sword. Stamina is now " + getStamina() + ".");
        }
    }

    public void takeDamage(int damage) {
        this.health -= damage;

        if (getHealth() <= 0) {
            this.health = 0;
            System.out.println("Character takes " + damage + " damage. Health is now " + getHealth() + ".");
            System.out.println("Character is dead.");
        } else {
            System.out.println("Character takes " + damage + " damage. Health is now " + getHealth() + ".");
        }
    }
    public void rest() {
        this.health = this.maxHealth;
        this.stamina = this.maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
        System.out.println("Character's health: "+this.health+", stamina: "+this.stamina+".");
    }
}
