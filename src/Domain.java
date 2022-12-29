import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
/**
 * @author Harshadkumar Patel, 000852665
 */
public class Domain {
    private double x;
    private double y;
    private double size;
    private String name;
    private Color color;

    /**
     * @param x start point position of the Domain x axis
     * @param y start point position of the Domain y axis
     * @param name name of the domain
     * @param color color of the domain
     */
    public Domain(double x, double y, String name, Color color) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
    }

    public void draw(GraphicsContext gc) {
        // Draw domain castle with same color
        Castle castle1 = new Castle(x, y, color, name);
        castle1.draw(gc);
        Castle castle2 = new Castle(x + 150, y, color, name);
        castle2.draw(gc);
        // Set the title of the castle if it's queen castle
        gc.fillText( name + " (" + (castle1.getSize() + castle2.getSize()) + " m, population " + (castle1.getDenizens() + castle2.getDenizens()) + ")", x + 40, y - 70, 500);
    }
}
