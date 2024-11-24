package Week5.Assignment4.controller;

import javafx.collections.FXCollections;
import Week5.Assignment4.model.Currency;
import Week5.Assignment4.view.CurrencyConverterView;

import java.util.HashMap;

public class CurrencyConverterController {
    private CurrencyConverterView view;
    private HashMap<String, Currency> currencyMap;

    public CurrencyConverterController(CurrencyConverterView view) {
        this.view = view;
    }

    public void initializeModel() {
        currencyMap = new HashMap<>();
        currencyMap.put("USD", new Currency("USD", "US Dollar", 1.0));
        currencyMap.put("EUR", new Currency("EUR", "Euro", 0.85));
        currencyMap.put("GBP", new Currency("GBP", "British Pound", 0.75));
        currencyMap.put("JPY", new Currency("JPY", "Japanese Yen", 110.0));
    }

    public void setupView() {
        view.getSourceCurrencyBox().setItems(FXCollections.observableArrayList(currencyMap.keySet()));
        view.getTargetCurrencyBox().setItems(FXCollections.observableArrayList(currencyMap.keySet()));
    }

    public void setupEventHandlers() {
        view.getConvertButton().setOnAction(event -> convertCurrency());
    }

    private void convertCurrency() {
        try {
            double sourceAmount = Double.parseDouble(view.getSourceAmountField().getText());
            String sourceCurrency = view.getSourceCurrencyBox().getValue();
            String targetCurrency = view.getTargetCurrencyBox().getValue();

            if (sourceCurrency == null || targetCurrency == null) {
                view.getMessageLabel().setText("Please select both currencies.");
                return;
            }

            Currency source = currencyMap.get(sourceCurrency);
            Currency target = currencyMap.get(targetCurrency);

            double result = source.convertTo(target, sourceAmount);
            view.getResultField().setText(String.format("%.2f", result));
            view.getMessageLabel().setText("");
        } catch (NumberFormatException e) {
            view.getMessageLabel().setText("Invalid amount entered!");
        }
    }
}
