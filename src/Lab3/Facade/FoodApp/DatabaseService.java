package Lab3.Facade.FoodApp;

public class DatabaseService {
    public User getUser(String userId) {
        return new User("A1", "Damian", 1000);
    }
}
