package Lab4.Template;

public class Main {
    public static void main(String[] args) {
        BaseGameLoader game = new AssassinsCreedLoader();
        game.load();

        System.out.println("------------------------------------");

        BaseGameLoader app = new OverwatchLoader();
        app.load();
    }
}
