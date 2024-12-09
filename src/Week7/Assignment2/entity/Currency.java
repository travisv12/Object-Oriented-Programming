package Week7.Assignment2.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Currency")
public class Currency {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "abbreviation")
    private String abbreviation;
    @Column(name = "name")
    private String name;
    @Column(name = "conversion_rate_to_usd")
    private double conversion_rate_to_usd;

    @OneToMany(mappedBy = "sourceCurrency", cascade = CascadeType.ALL)
    private List<Transaction> sourceTransactions;

    @OneToMany(mappedBy = "targetCurrency", cascade = CascadeType.ALL)
    private List<Transaction> targetTransactions;

    public Currency() {
    }

    public Currency(String abbreviation, String name, double conversion_rate_to_usd) {
        super();
        this.abbreviation = abbreviation;
        this.name = name;
        this.conversion_rate_to_usd = conversion_rate_to_usd;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getConversionRateToUSD() {
        return conversion_rate_to_usd;
    }

    public void setConversionRateToUSD(double conversion_rate_to_usd) {
        this.conversion_rate_to_usd = conversion_rate_to_usd;
    }
}