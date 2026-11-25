package Shapes;

import com.pluralsight.Shape;
import com.pluralsight.Turtle;

import java.awt.*;

public class Triangle extends Shape {
    private double side;
    public Triangle(Turtle turtle, Point location, Color color, double border, double side) {
        super(turtle, location, color, border );
        this.side = side;
    }

    @Override
    public void paint() {
        Turtle turtle = getTurtle();
        turtle.penUp();
        turtle.goTo(getLocation());
        turtle.setColor(getColor());
        turtle.setPenWidth(3);
        turtle.penDown();
        turtle.setDelay(0.1);

        turtle.turnLeft(60);
        turtle.forward(120);
        turtle.turnLeft(-120);
        turtle.forward(120);
        turtle.turnLeft(-120);
        turtle.forward(120);

    }
}
