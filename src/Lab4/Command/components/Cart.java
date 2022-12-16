package Lab4.Command.components;

public class Cart extends Component{
    private final Item item;

    public Cart(){
        this.item = new Item();
    }

    public Item getItem(){
        return item;
    }
}
