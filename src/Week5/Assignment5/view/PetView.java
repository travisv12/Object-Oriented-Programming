package Week5.Assignment5.view;

import Week5.Assignment5.controller.PetController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PetView extends Application {
    private static final int CANVAS_WIDTH = 800;
    private static final int CANVAS_HEIGHT = 600;

    private Canvas canvas;
    private GraphicsContext gc;
    private Image petImage = new Image(getClass().getResource("/pet.png").toExternalForm());
    private PetController controller;

    @Override
    public void start(Stage primaryStage) {
        // Initialize components
        canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
        gc = canvas.getGraphicsContext2D();

        // Mouse movement event handlers
        canvas.setOnMouseMoved(this::handleMouseMoved);
        canvas.setOnMouseExited(event -> controller.stopPet());

        // Add canvas to the scene
        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, CANVAS_WIDTH, CANVAS_HEIGHT);

        primaryStage.setTitle("Virtual Pet");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> controller.requestShutdown());
        // Initial draw
        updateCanvas();
    }

    public void init() {
        controller = new PetController(CANVAS_WIDTH/2.0, CANVAS_HEIGHT/2.0, this);
    }

    private void handleMouseMoved(MouseEvent event) {
        controller.updateTargetPosition(event.getX(), event.getY());
    }

    public void updateCanvas() {
        gc.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
        gc.drawImage(petImage, controller.getPetX()-petImage.getWidth()/2, controller.getPetY()-petImage.getHeight()/2);
    }
}
