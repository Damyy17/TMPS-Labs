package Lab4.Template;

public class OverwatchLoader extends BaseGameLoader {

    @Override
    byte[] loadLocalData() {
        System.out.println("Loading game files...");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating game objects..");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading game additional files...");
    }

    @Override
    void initializeProfiles() {
        System.out.println("Loading game profiles...");
    }
}
