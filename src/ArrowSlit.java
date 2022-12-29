import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * @author Harshadkumar Patel, 000852665
 */
public class ArrowSlit {
    private double x;
    private double y;
    private double height;

    /**
     * @param x start point position of the ArrowSlit x axis
     * @param y start point position of the ArrowSlit y axis
     * @param height height of the ArrowSlit
     */
    public ArrowSlit(double x, double y, double height) {
        this.x = x;
        this.y = y;
        this.height = height;
    }

    public void draw(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        // Draw the arrow slit on the castle based on width of the castle
        // So height of the arrow slit is 1.5 times higher
        gc.fillRect(x, y, height, height * 1.5);
    }

}
