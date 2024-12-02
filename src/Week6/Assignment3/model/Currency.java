package Week6.Assignment3.model;

public class Currency {
    private String abbreviation;
    private String name;
    private double conversionRateToUSD;

    public Currency(String abbreviation, String name, double conversionRateToUSD) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.conversionRateToUSD = conversionRateToUSD;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }

    public double getConversionRateToUSD() {
        return conversionRateToUSD;
    }

    public double convertTo(Currency targetCurrency, double amount) {
        double amountInUSD = amount / this.conversionRateToUSD;
        return amountInUSD * targetCurrency.getConversionRateToUSD();
    }
}
