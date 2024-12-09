package Wee7.Assignment2.controller;

package controller;

import dao.CurrencyDao;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import entity.Currency;
import view.CurrencyConverterView;
import entity.Transaction;
import dao.TransactionDao;

import java.util.List;

public class CurrencyConverterController {
    private CurrencyConverterView view;
    private CurrencyDao currencyDao;
    private TransactionDao transactionDao;

    public CurrencyConverterController(CurrencyConverterView view) {
        this.view = view;
        this.currencyDao = new CurrencyDao();
        this.transactionDao = new TransactionDao();
    }

    public void setupView() {
        List<Currency> currencies = currencyDao.getAllCurrencies();
        ObservableList<String> currencyAbbreviations = FXCollections.observableArrayList();
        for (Currency currency : currencies) {
            currencyAbbreviations.add(currency.getAbbreviation());
        }
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
            Currency sourceCurrencyEntity = currencyDao.getCurrencyByAbbreviation(sourceCurrency);
            Currency targetCurrencyEntity = currencyDao.getCurrencyByAbbreviation(targetCurrency);
            Transaction transaction = new Transaction(sourceAmount, sourceCurrencyEntity, targetCurrencyEntity);
            transactionDao.persist(transaction);
        } catch (NumberFormatException e) {
            view.getMessageLabel().setText("Invalid amount entered!");
        } catch (Exception e) {
            view.getMessageLabel().setText("Error processing transaction.");
        }
    }

    public void addCurrency(Currency currency) {
        currencyDao.persist(currency);
    }
}