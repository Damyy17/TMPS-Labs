package Lab3.Adapter;

public class Pizza implements Price{

    @Override
    public double getPrice(){
        return 20.99;
    }
}
