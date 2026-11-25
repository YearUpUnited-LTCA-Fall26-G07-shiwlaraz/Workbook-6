package Shapes;
import java.awt.Color;
import java.awt.Point;


import com.pluralsight.Shape;
import com.pluralsight.Turtle;

public class Hut extends Shape {
    public double side;

    public Hut(Turtle turtle, Point location, Color color, double border, double side) {
        super (turtle, location, color, border);
        this.side = side;
    }

    @Override
    public void paint() {
        Turtle turtle = getTurtle();

        turtle.setPenWidth(3);
        turtle.setColor(getColor());
        turtle.penDown();

        for (int i = 0; i < 4; i++) {
            turtle.forward(130);
            turtle.turnRight(90);
        }
        turtle.penUp();
        turtle.goTo(70, 60);
        turtle.penDown();

        turtle.turnRight(150);
        turtle.forward(120);
        turtle.turnLeft(150);
        turtle.forward(200);
        turtle.turnLeft(150);
        turtle.forward(120);

        turtle.penUp();
        turtle.goTo(102, -55);
        turtle.penDown();
        turtle.turnLeft(30);
        turtle.penDown();

        for (int i = 0; i < 4; i++) {
            turtle.forward(25);
            turtle.turnRight(90);
        }
        turtle.penUp();
        turtle.goTo(52, -55);

        turtle.penDown();

        for (int i = 0; i < 4; i++) {
            turtle.forward(25);
            turtle.turnRight(90);
        }

        turtle.penUp();
        turtle.goTo(46, -80);
        turtle.turnRight(-90);
        turtle.penDown();
        turtle.forward(50);
        turtle.turnRight(-90);
        turtle.forward(40);
        turtle.turnRight(-90);
        turtle.forward(50);
        turtle.turnRight(-90);
        turtle.forward(40);
    }
}