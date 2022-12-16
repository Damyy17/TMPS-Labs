# Laboratory work nr 4, TMPS
## Behavioral Design Patterns

---

## Theory
In software engineering, behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication.

## Implementation description
### Chain of Responsibility Pattern
* Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.
* Launch-and-leave requests with a single processing pipeline that contains many possible handlers.
* An object-oriented linked list with recursive traversal.
The implementation itself:
```
public abstract class Handler {
    private Handler next;

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password) {
        if (next == null) {
            return true;
        }
        return next.handle(username, password);
    }
}

public class RoleCheckHandler extends Handler {

    @Override
    public boolean handle(String username, String password) {
        if ("admin_username".equals(username)) {
            System.out.println("Loading Admin Page...");
            return true;
        }
        System.out.println("Loading Default Page...");
        return handleNext(username, password);
    }
}
```
So, in the implementation we have a project about applications on the phone, the chain of responsibility was used in authorization of the user when he 
accesses an app, the chain passes any requests messages from object to object till it reaches the object that is capable for handle message. So, we have a base
abstract class, and from this class some handlers, like role checker, users existences checker and validation of the password.

### Command Pattern
* Encapsulate a request as an object, thereby letting you parametrize clients with different requests, queue or log requests, and support undoable operations.
* Promote "invocation of a method on an object" to full object status
* An object-oriented callback 
The implementation:
```
public interface Command {
    void execute();
}

public record SaveItemCommand(Item item) implements Command{
    @Override
    public void execute() {
        item.saveItem();
    }
}

public abstract class Component {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}

public class Cart extends Component{
    private final Item item;

    public Cart(){
        this.item = new Item();
    }

    public Item getItem(){
        return item;
    }
}
```
Here in the implementation was defined a Command interface with a method signature like execute(). After was created derived classes that encapsulates some following: a "receiver" object, the method to invoke, 
the arguments to pass. After, take place the instantiation of a Command object for each deferred execution request. The command is passed from the creator to 
the invoker, and invoker decides when to execute().

### Memento Pattern
* Without violating encapsulation, capture and externalize an object's internal state so that the object can be returned to this state later.
* A magic cookie that encapsulates a "check point" capability.
* Promote undo or rollback to full object status.
In the project memento is used when we need to restore something back to its previous state, like an undo operarion:
```
public class TextArea {
    private String text;

    public void set(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Memento takeSnapshot() {
        return new Memento(this.text);
    }

    public void restore(Memento memento) {
        this.text = memento != null ? memento.getSavedText() : null;
    }

    public static class Memento {
        private final String text;

        private Memento(String textToSave) {
            text = textToSave;
        }

        private String getSavedText() {
            return text;
        }
    }
}
```
This implementation can be used in any app, for example in notes, so here first we create a class TextArea and in this class we create 
the memento class, so the textarea being the originator class. So the caretaker is editor class, it  holds on to (but cannot peek into) the Memento and knows
when to roll back the originator.


### Mediator Pattern
* Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
* Design an intermediary to decouple many peers.
* Promote the many-to-many relationships between interacting peers to "full object status".
The implementation:
```
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}

public interface Mediator {
    void login();

    void forgotPass();
}

public class Dialog implements Mediator{
    private final JTextField userTextBox = new JTextField();
    private final JTextField passTextBox = new JTextField();
    private final LoginButton loginButton = new LoginButton();
    private final ForgotPasswordButton passwordButton = new ForgotPasswordButton();

    public Dialog() {
        loginButton.setMediator(this);
        passwordButton.setMediator(this);
    }

    @Override
    public void login() {
        System.out.println("Logging in...");
        String username = userTextBox.getText();
        String password = passTextBox.getText();
        // validate username and password
        // logs in the user or pops error message
    }

    @Override
    public void forgotPass() {
        System.out.println("Generating new Password...");
        String username = userTextBox.getText();
        // generate new pass for the user
        // send mail to this username with new pass
    }

    public void enterUsername(String username) {
        userTextBox.setText(username);
    }

    public void enterPassword(String password) {
        passTextBox.setText(password);
    }

    public void simulateLoginClicked() {
        loginButton.fireActionPerformed(new ActionEvent(this, 0, "login"));
    }

    public void simulateForgotPassClicked() {
        passwordButton.fireActionPerformed(new ActionEvent(this, 0, "forgot pass"));
    }

}
```
So in the implementation, components have a reference to the interface of the following mediator allowing us to reuse this component in other programs, the mediator interface
declares the methods in which the means of communication between our components is specified. And the concrete mediator which is Dialog.class encapsulates relations between the various
components it manages.

### Template Pattern
* Define the skeleton of an algorithm in an operation, deferring some steps to client subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
* Base class declares algorithm 'placeholders', and derived classes implement the placeholders.
The implementation:
```
public abstract class BaseGameLoader {
    public void load() {
        byte[] data = loadLocalData();
        createObjects(data);
        downloadAdditionalFiles();
        cleanTempFiles();
        initializeProfiles();
    }

    abstract byte[] loadLocalData();

    abstract void createObjects(byte[] data);

    abstract void downloadAdditionalFiles();

    abstract void initializeProfiles();

    protected void cleanTempFiles() {
        System.out.println("Cleaning temporary files...");
    }
}
```
So last implementation is template method, and games are also apps that can be found on the phone, so in games template is used for
turning an algorithm into a series of individual methods and keeps the structure of base algorithm and also eliminates code 
duplication by pulling the steps with similar implementation into the superclass.


## Conclusion
During the laboratory work nr 4, was studied behavioral design patterns and were implemented 5 of them.