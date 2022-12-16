package Lab4.Template;

public class AssassinsCreedLoader extends BaseGameLoader {
    @Override
    public byte[] loadLocalData() {
        System.out.println("Loading Some Game files...");
        return new byte[0];
    }

    @Override
    public void createObjects(byte[] data) {
        System.out.println("Creating Game objects...");
    }

    @Override
    public void downloadAdditionalFiles() {
        System.out.println("Downloading Game sounds...");
    }

    @Override
    public void initializeProfiles() {
        System.out.println("Loading Game profiles...");
    }

}
