package Shapes;
import java.awt.Color;
import java.awt.Point;


import com.pluralsight.Shape;
import com.pluralsight.Turtle;

public class Circle extends Shape{
    public double radius;

    public Circle(Turtle turtle, Point location, Color color, double border,
                  double radius) {
        super(turtle, location, color, border);
        this.radius = radius;
    }

    @Override
    public void paint() {
        Turtle turtle = getTurtle();

        turtle.penUp();
        turtle.goTo(getLocation());
        turtle.setColor(getColor());
        turtle.setPenWidth(getBorder());
        turtle.setHeading(0);

        double circumference = 2 * Math.PI * radius;
        double distance = circumference / 360;
        turtle.penDown();
        turtle.setDelay(0.0001);
        for (int i = 0; i < 360; i++) {
            turtle.forward(distance);
            turtle.turnRight(1);
        }

    }
}
