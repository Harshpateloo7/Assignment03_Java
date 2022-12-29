import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * @author Harshadkumar Patel, 000852665
 */
public class Castle {
    private double x;
    private double y;
    private double size;
    private int denizens;
    private Color color;
    private String title;

    /**
     * @param x start point position of the castle x axis
     * @param y start point position of the castle y axis
     * @param size which store the random size of the castle
     * @param color color of the castle
     */
    public Castle(double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        denizens = 100;
    }

    /**
     * @param x start point position of the castle x axis
     * @param y start point position of the castle y axis
     * @param color color of the castle
     * @param title title of the castle
     */
    public Castle(double x, double y, Color color, String title) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.title = title;
    }

    /**
     * @return return random number of size
     */
    public double getSize() {
        if(size == 0) {
            size = gRN(3000,5000);
        }
        return size;
    }

    /**
     * @return return random number of Denizens
     */
    public int getDenizens() {
        if(denizens == 0) {
            denizens = gRN(1000,2000);
        }
        return denizens;
    }

    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        // Set the title of the castle if it's queen castle
        if(title == null) {
            gc.fillText("The Crimson Queen!", x + 40, y - 70, 500);
        }
        // Random size of the castle
        int rSC = gRN(50, 150);
        // Draw the castle top left portion
        gc.fillRect(x, y - (rSC / 6), (rSC / 6), (rSC / 6));
        // Draw the castle top right portion
        gc.fillRect(x + rSC - (rSC / 6), y - (rSC / 6), (rSC / 6), (rSC / 6));
        // Draw the castle with random width and 1.5 times higher height
        gc.fillRect(x, y, rSC, rSC * 1.5);

        // Draw the gat in the castle
        // Pass height of the castle is 1.5 times higher than castle width
        Gate gate = new Gate(x + (rSC / 3), y + rSC, (rSC / 2));
        gate.draw(gc);

        // Draw the first arrow slit in the castle
        ArrowSlit arrowSlit1 = new ArrowSlit(x + (rSC / 6), y + (rSC / 6), (rSC / 6));
        arrowSlit1.draw(gc);
        // Draw the second arrow slit in the castle
        ArrowSlit arrowSlit2 = new ArrowSlit(x + (rSC / 1.5), y + (rSC / 6), (rSC / 6));
        arrowSlit2.draw(gc);
    }

    /**
     *
     * @param mi minimum value
     * @param mx maximum value
     * @return return the random number between minimum and maximum value
     */
    public int gRN(int mi, int mx) {
        if(title != null) {
            return (int) ((Math.random() * (mx - mi)) + mi);
        } else {
            return 200;
        }
    }
}
