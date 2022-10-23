package Lab1.OCP;

public class Main {

    public static void main(String[] args) {
        System.out.println("Open-Closed Principle : ");

        Weapon sword = new Sword(20, 3);
        Weapon bow = new Bow(10, 50);

        Player player1 = new Player("Kendall", sword);
        player1.attack();
        player1.changeWeapon(bow);
        player1.attack();
    }
}
