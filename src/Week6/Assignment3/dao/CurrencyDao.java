package Week6.Assignment3.dao;

import Week6.Assignment3.datasource.MariaDbConnection;
import Week6.Assignment3.model.Currency;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class CurrencyDao {
    private Map<String, Currency> currencyMap = new HashMap<>();

    public CurrencyDao() {
        loadAllCurrencies();
    }

    private void loadAllCurrencies() {
        String query = "SELECT abbreviation, name, conversion_rate_to_usd FROM Currency";
        try (Connection conn = MariaDbConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Currency currency = new Currency(
                        rs.getString("abbreviation"),
                        rs.getString("name"),
                        rs.getDouble("conversion_rate_to_usd")
                );
                currencyMap.put(currency.getAbbreviation(), currency);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public double getExchangeRate(String abbreviation) {
        Currency currency = currencyMap.get(abbreviation);
        return (currency != null) ? currency.getConversionRateToUSD() : -1;
    }

    public Map<String, Currency> getAllCurrencies() {
        return currencyMap;
    }
}