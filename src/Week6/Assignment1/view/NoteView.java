package Week6.Assignment1.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NoteView extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/noteView.fxml"));
        Parent root = fxmlLoader.load();
        stage.setTitle("Note Taking Application");
        stage.setScene(new Scene(root));
        stage.show();
    }
}