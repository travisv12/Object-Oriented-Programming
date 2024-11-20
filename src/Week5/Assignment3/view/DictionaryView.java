package Week5.Assignment3.view;

import Week5.Assignment3.controller.DictionaryController;
import Week5.Assignment3.model.Dictionary;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {
    private DictionaryController controller;
    private TextField wordInput;
    private Label meaningLabel;

    @Override
    public void start(Stage stage) {
        // Initialize the controller
        Dictionary model = new Dictionary();
        controller = new DictionaryController(model);

        // UI components
        wordInput = new TextField();
        meaningLabel = new Label("Meaning will appear here.");
        Button searchButton = new Button("Search");

        // Layout
        FlowPane layout = new FlowPane();
        layout.setVgap(10);
        layout.setHgap(10);
        layout.getChildren().addAll(wordInput, searchButton, meaningLabel);

        // Event handler for the search button
        searchButton.setOnAction(event -> handleSearch());

        // Set up the stage
        Scene scene = new Scene(layout, 300, 200);
        stage.setTitle("Virtual Dictionary");
        stage.setScene(scene);
        stage.show();
    }

    // Method to handle the search operation
    private void handleSearch() {
        String word = wordInput.getText();
        String result = controller.searchForWord(word);
        meaningLabel.setText(result);
    }
}

