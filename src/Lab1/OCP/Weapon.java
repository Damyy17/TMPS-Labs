package Lab1.OCP;

public class Weapon implements Attacker{
    int damage;
    int range;

    public Weapon(int damage, int range) {
        this.damage = damage;
        this.range = range;
    }
}
