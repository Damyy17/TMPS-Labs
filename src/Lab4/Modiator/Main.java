package Lab4.Modiator;

public class Main {
    public static void main(String[] args) {
        Dialog dialog = new Dialog();
        dialog.enterUsername("Damian123");
        dialog.enterPassword("password123");
        dialog.simulateLoginClicked();
        dialog.simulateForgotPassClicked();
    }
}
