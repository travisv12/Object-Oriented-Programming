package Week6.Assignment3.view;

package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import Week6.Assignment3.controller.CurrencyConverterController;

public class CurrencyConverterView extends Application {
    private TextField sourceAmountField;
    private TextField resultField;
    private ComboBox<String> sourceCurrencyBox;
    private ComboBox<String> targetCurrencyBox;
    private Button convertButton;
    private Label messageLabel;
    private CurrencyConverterController controller;

    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10);
        root.setPadding(new Insets(10, 10, 10, 10));

        Label titleLabel = new Label("Currency Converter");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-family: sans-serif;");

        HBox sourceBox = new HBox(10);
        Label sourceAmountLabel = new Label("Amount:");
        sourceAmountField = new TextField();
        sourceBox.getChildren().addAll(sourceAmountLabel, sourceAmountField);

        VBox currencyBox = new VBox(10);
        Label sourceCurrencyLabel = new Label("From:");
        sourceCurrencyBox = new ComboBox<>();
        Label targetCurrencyLabel = new Label("To:");
        targetCurrencyBox = new ComboBox<>();
        currencyBox.getChildren().addAll(sourceCurrencyLabel, sourceCurrencyBox, targetCurrencyLabel, targetCurrencyBox);

        HBox resultBox = new HBox(10);
        Label resultLabel = new Label("Converted:");
        resultField = new TextField();
        resultField.setEditable(false);
        resultBox.getChildren().addAll(resultLabel, resultField);

        convertButton = new Button("Convert");
        messageLabel = new Label();
        messageLabel.setStyle("-fx-text-fill: red;");

        root.getChildren().addAll(titleLabel, sourceBox, currencyBox, resultBox, convertButton, messageLabel);

        controller = new CurrencyConverterController(this);
        controller.setupView();
        controller.setupEventHandlers();

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Currency Converter");
        stage.setScene(scene);
        stage.show();
    }

    public TextField getSourceAmountField() {
        return sourceAmountField;
    }

    public TextField getResultField() {
        return resultField;
    }

    public ComboBox<String> getSourceCurrencyBox() {
        return sourceCurrencyBox;
    }

    public ComboBox<String> getTargetCurrencyBox() {
        return targetCurrencyBox;
    }

    public Button getConvertButton() {
        return convertButton;
    }

    public Label getMessageLabel() {
        return messageLabel;
    }
}