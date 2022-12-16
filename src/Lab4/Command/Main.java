package Lab4.Command;

import Lab4.Command.commands.SaveItemCommand;
import Lab4.Command.components.Cart;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.setCommand(new SaveItemCommand(cart.getItem()));
        cart.executeCommand();
    }
}
