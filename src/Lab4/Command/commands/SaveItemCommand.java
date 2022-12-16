package Lab4.Command.commands;

import Lab4.Command.components.Item;

public record SaveItemCommand(Item item) implements Command{
    @Override
    public void execute() {
        item.saveItem();
    }
}
