package Lab4.Mememnto;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("OMG your product is Amazing!");
        editor.printText();
        editor.write("The best!");
        editor.printText();
        editor.write("Great item!");
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();

    }
}
