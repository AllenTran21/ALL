//package chp11.shapes;

import java.util.Scanner;
import java.util.ArrayList;

public class Chp11Shapes
{
	public static final String menu = "Please make a selection:\n"
			+ "1 - Add a Rectangle\n"
			+ "2 - Add a Square\n"
			+ "3 - Add a Right Triangle\n"
			+ "4 - Add an Isosceles Triangle\n"
			+ "5 - Draw all the Shapes\n"
			+ "6 - Quit";
	
	public static int promptForInteger(Scanner input, String message, int min, int max)
	{
		System.out.println(message);
		int response = input.nextInt();
		while (response < min || max < response)
		{
			System.out.println(message);
			response = input.nextInt();
		}
		return response;
	}
	
	public static void addRectangle(Scanner input, ArrayList<Shape> shapes)
	{
		int width = promptForInteger(input, "Width of rectangle:", 1, 30);
		int height = promptForInteger(input, "Height of rectangle:", 1, 30);
		shapes.add(new Rectangle(width, height));
	}
	
	public static void addSquare(Scanner input, ArrayList<Shape> shapes)
	{
		int size = promptForInteger(input, "Size of square:", 1, 30);
		shapes.add(new Square(size));
	}
	
	public static void addRightTriangle(Scanner input, ArrayList<Shape> shapes)
	{
		int size = promptForInteger(input, "Size of right triangle:", 1, 30);
		shapes.add(new RightTriangle(size));
	}
	
	public static void addIsoscelesTriangle(Scanner input, ArrayList<Shape> shapes)
	{
		int size = promptForInteger(input, "Size of isosceles triangle:", 1, 30);
		shapes.add(new IsoscelesTriangle(size));
	}
	
	public static void drawShapes(ArrayList<Shape> shapes)
	{
		for(Shape shape : shapes)
		{
			shape.draw();
		}
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int response;
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		do
		{
			response = promptForInteger(input, menu, 1, 6);
			
			switch(response)
			{
				case 1:
					addRectangle(input, shapes);
					break;
				case 2:
					addSquare(input, shapes);
					break;
				case 3:
					addRightTriangle(input, shapes);
					break;
				case 4:
					addIsoscelesTriangle(input, shapes);
					break;
				case 5:
					drawShapes(shapes);
					break;
				case 6:
					System.out.println("Thanks!  Goodbye!");
					break;
				default:
					System.out.println("Invalid input, try again.");
					break;
			}
		} while(response != 6);
	}
	
}
