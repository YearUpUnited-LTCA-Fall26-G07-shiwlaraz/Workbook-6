import java.awt.*;

public abstract class Shape implements Paintings {

    private Turtle turtle;
    private Paint location;
    private Color color;
    private double border;

    public Shape(Turtle turtle, Paint location, Color color, double border) {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.border = border;
    }
}
