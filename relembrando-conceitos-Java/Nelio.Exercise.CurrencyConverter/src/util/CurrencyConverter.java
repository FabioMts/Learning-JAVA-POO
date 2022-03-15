package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double convertDollar(double dollarBought, double dollarPrice) {
        return dollarBought * dollarPrice * (1.0 + IOF);

    }

}
