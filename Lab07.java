public class Lab07
{
    public static void main(String[] args) {
        Character knight = new Character(100,50);
        //Character panda = new Character(50,100);  another instance to test
        knight.swingSword();
        knight.swingSword();
        knight.swingSword();
        knight.swingSword();
        knight.swingSword();
        knight.takeDamage(30);
        knight.takeDamage(50);
        knight.takeDamage(20);
        knight.rest();
        //panda.takeDamage(100);
    }
}