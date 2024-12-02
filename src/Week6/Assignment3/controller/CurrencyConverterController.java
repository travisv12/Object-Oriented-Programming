package Week6.Assignment3.controller;

import Week6.Assignment3.dao.CurrencyDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import Week6.Assignment3.model.Currency;
import Week6.Assignment3.view.CurrencyConverterView;

import java.util.Map;

public class CurrencyConverterController {
    private CurrencyConverterView view;
    private CurrencyDao currencyDao;

    public CurrencyConverterController(CurrencyConverterView view) {
        this.view = view;
        this.currencyDao = new CurrencyDao();
    }

    public void setupView() {
        Map<String, Currency> currencies = currencyDao.getAllCurrencies();
        ObservableList<String> currencyAbbreviations = FXCollections.observableArrayList(currencies.keySet());
        view.getSourceCurrencyBox().setItems(currencyAbbreviations);
        view.getTargetCurrencyBox().setItems(currencyAbbreviations);
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

            double sourceRate = currencyDao.getExchangeRate(sourceCurrency);
            double targetRate = currencyDao.getExchangeRate(targetCurrency);

            if (sourceRate == -1 || targetRate == -1) {
                view.getMessageLabel().setText("Error fetching exchange rates.");
                return;
            }

            double result = (sourceAmount / sourceRate) * targetRate;
            view.getResultField().setText(String.format("%.2f", result));
            view.getMessageLabel().setText("");
        } catch (NumberFormatException e) {
            view.getMessageLabel().setText("Invalid amount entered!");
        }
    }
}