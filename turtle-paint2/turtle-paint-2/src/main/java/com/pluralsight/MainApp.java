package com.pluralsight;

import Shapes.Circle;
import Shapes.House;
import Shapes.Square;

import java.awt.*;

public class MainApp
{
    public static void main(String[] args) {
        World world = new World(600, 600);
        Turtle turtle = new Turtle(world);
        Shape house = new House(
                turtle,
                new Point(-100, 100),
                Color.BLUE,
                3,
                100);
        house.paint();
        Shape circle = new Circle(
                turtle,
                new Point(-100, 100),
                Color.RED,
                3,
                100
        );
        circle.paint();








    }

}

