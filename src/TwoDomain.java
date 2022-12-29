import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Random;

/**
 * @author Harshadkumar Patel, 000852665
 */
public class TwoDomain extends Application {
    /**
     * Start method : use this instead of main
     * @param stage : The world to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        // Set the canvas size in pixels
        Canvas canvas = new Canvas(1000, 750);
        // Set the window title
        stage.setTitle("The World");
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        // YOUR CODE STARTS HERE
        // Draw the queen castle with random size with red color
        Castle castle = new Castle(400, 300, new Random().nextInt(5000), Color.RED);
        castle.draw(gc);
        // Generate the random number to set random color for the domain
        boolean isEvenBool = new Random().nextInt(2) % 2 == 0;
        // Draw the Beszel domain castle with random color
        Domain domain1 = new Domain(100,200,"Beszel", isEvenBool ? Color.BLUE : Color.GREEN);
        domain1.draw(gc);
        // Draw the UI Qoma domain castle with random color
        Domain domain2 = new Domain(700,200,"UI Qoma", !isEvenBool ? Color.BLUE : Color.GREEN);
        domain2.draw(gc);
        // YOUR CODE STOPS HERE
        stage.show();
    }
    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
