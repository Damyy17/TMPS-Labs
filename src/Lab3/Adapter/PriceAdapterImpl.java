package Lab3.Adapter;

public class PriceAdapterImpl implements PriceAdapter{
    private final Price priceInEuroCurrency;

    public PriceAdapterImpl(Price priceInEuroCurrency) {
        this.priceInEuroCurrency = priceInEuroCurrency;
    }

    @Override
    public double getPrice() {
        return convertEuroToDollar(priceInEuroCurrency.getPrice());
    }

    private double convertEuroToDollar(double euro){
        return euro * 0.97;
    }
}
