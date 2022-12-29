import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * @author Harshadkumar Patel, 000852665
 */
public class Gate {
    private double x;
    private double y;
    private double height;

    /**
     * @param x start point position of the gate x axis
     * @param y start point position of the gate y axis
     * @param height height of the gate
     */
    public Gate(double x, double y, double height) {
        this.x = x;
        this.y = y;
        this.height = height;
    }

    public void draw(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        // Draw the gat on the castle based on width of the castle
        // So height of the gat is 1.5 times higher than castle width
        gc.fillRect(x, y, height / 1.5, height);
    }
}
