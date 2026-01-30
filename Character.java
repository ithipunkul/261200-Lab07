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
        if (this.stamina>0) {
            this.stamina -=10;
        }

        if (this.stamina<=0) {
            this.stamina = 0;
            System.out.println("Character swings the sword. Stamina is now "+this.stamina+".");
            System.out.println("Your character needs to cool down.");
        } else {
            System.out.println("Character swings the sword. Stamina is now "+this.stamina+".");
        }
    }
    public void takeDamage(int damage) {
        this.health -= damage;

        // เช็คว่า Health หมดหรือยัง
        if (this.health <= 0) {
            this.health = 0;
            // เพิ่มบรรทัดนี้: แจ้งว่าเหลือ 0 ก่อน
            System.out.println("Character takes " + damage + " damage. Health is now "+this.health+".");
            // แล้วค่อยแจ้งเตือน event
            System.out.println("Character is dead.");
        } else {
            System.out.println("Character takes " + damage + " damage. Health is now " + this.health + ".");
        }
    }
    public void rest() {
        this.health = this.maxHealth;
        this.stamina = this.maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
        System.out.println("Character's health: "+this.health+", stamina: "+this.stamina+".");
    }
}
