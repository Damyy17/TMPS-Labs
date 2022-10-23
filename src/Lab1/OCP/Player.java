package Lab1.OCP;

public class Player {
    private Weapon weapon;

    public Player(String name, Weapon weapon) {
        this.weapon = weapon;
    }

    void changeWeapon(Weapon newWeapon){
        this.weapon = newWeapon;
    }

    public void attack(){
        this.weapon.attack();
    }


}
