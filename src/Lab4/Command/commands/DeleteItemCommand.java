package Lab4.Command.commands;

import Lab4.Command.components.Item;

public record DeleteItemCommand(Item item) implements Command{

    @Override
    public void execute() {
        item.deleteItem();
    }
}
