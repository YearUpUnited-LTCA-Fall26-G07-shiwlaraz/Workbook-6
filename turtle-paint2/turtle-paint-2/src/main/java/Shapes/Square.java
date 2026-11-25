package Shapes;

import com.pluralsight.Shape;
import com.pluralsight.Turtle;

import java.awt.*;

public class Square extends Shape {
    private double side;

    public Square(Turtle turtle, Point location, Color color, double border, double side) {
        super(turtle, location, color, border);
        this.side = side;
    }


    @Override
    public void paint() {
        Turtle turtle = getTurtle();

        turtle.penUp();
        turtle.goTo(getLocation());
        turtle.setColor(getColor());

        turtle.setPenWidth(getBorder());
        turtle.setDelay(0.1);
        turtle.penDown();

        for (int i = 0; i < 4; i++) {
            turtle.forward(130);
            turtle.turnRight(90);
        }
    }
}


