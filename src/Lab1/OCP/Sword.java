package Lab1.OCP;

public class Sword extends Weapon{

    Sword(int damage, int range) {
        super(damage, range);
    }

    public void attack(){
        System.out.println("Damaged by sword is " + this.damage + " units health");
    }
}
