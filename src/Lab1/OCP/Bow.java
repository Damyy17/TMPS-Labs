package Lab1.OCP;

public class Bow extends Weapon{

    Bow(int damage, int range) {
        super(damage, range);
    }

    public void attack(){
        System.out.println("Damaged by bow is " + this.damage + " units health");
    }
}
