package com.pluralsight;

import com.pluralsight.Paintings;
import com.pluralsight.Turtle;

import java.awt.*;

public abstract class Shape implements Paintings {

    private Turtle turtle;
    private Point location;
    private Color color;
    private double border;

    public Shape(Turtle turtle, Point location, Color color, double border) {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.border = border;
    }

    public Turtle getTurtle() {
        return turtle;
    }

    public Point getLocation() {
        return location;
    }

    public Color getColor() {
        return color;
    }

    public double getBorder() {
        return border;
    }
    @Override
    public abstract void paint();

}
