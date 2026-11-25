package Persistants;

import Shapes.Circle;
import Shapes.Square;
import Shapes.Triangle;
import com.pluralsight.Shape;
import com.pluralsight.Turtle;
import com.pluralsight.World;

import java.awt.*;

public class UserInterface {
    World world = new World(600, 600);
    Turtle turtle = new Turtle(world);

    public void display() {
        while (true) {
            System.out.println("""
                                        1 - Creat a square
                                        2 - Creat a circle
                                        3 - Creat a triangle;
                                        4 - Create a house;

                    """);
            int choice = Console.promptForInt("Enter the Choice number you want to create");
            switch (choice)  {
                case 1 -> CreateSquare();
                case 2 -> CreateCircle();
            }

        }
    }
    public Color getColor() {
        String color = Console.promptForString(
                "Enter color (RED, BLUE, BLACK, GREEN, YELLOW, PINK)"
        ).trim().toLowerCase();
        Color colorChoice;

        if (color.equals("red")) {
            colorChoice = Color.RED;
        } else if (color.equals("blue")) {
            colorChoice = Color.BLUE;
        } else if (color.equals("black")) {
            colorChoice = Color.BLACK;
        } else if (color.equals("green")) {
            colorChoice = Color.GREEN;
        } else if (color.equals("yellow")) {
            colorChoice = Color.YELLOW;
        } else if (color.equals("pink")) {
            colorChoice = Color.PINK;
        } else {
            System.out.println("Invalid color. Using BLACK.");
            colorChoice = Color.BLACK;
        }
        return colorChoice;

    }


    public void CreateSquare() {

        World world = new World(600, 600);
        Turtle turtle = new Turtle(world);

        int pointX = Console.promptForInt("Enter X location");
        int pointY = Console.promptForInt("Enter Y location");

        int border = Console.promptForInt("Enter Border Size");
        int size = 100;

        Shape square = new Square(
                turtle,
                new Point(pointX, pointY),
                getColor(),
                border,
                size
        );

        square.paint();
    }public void CreateCircle() {
        World world = new World(600, 600);
        Turtle turtle = new Turtle(world);

        int pointX = Console.promptForInt("Enter X location");
        int pointY = Console.promptForInt("Enter Y location");
        double radius = Console.promptForDouble("Enter the radius");
        int border = Console.promptForInt("Enter Border Size");
        int size = 100;

        Shape Circle = new Circle(
                turtle,
                new Point(pointX, pointY),
                getColor(),
                border,
                radius
        );
    }

}

