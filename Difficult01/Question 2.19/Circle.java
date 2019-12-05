import java.util.Scanner;

public class Circle {
	
	private Scanner keyboardInput;
	private int circleRadius;
	private int circleDiameter;
	private double circleCircumference;
	private double circleArea;

	public Circle() {
		keyboardInput = new Scanner(System.in);
		System.out.println("Enter the Circle's radius");
		circleRadius = keyboardInput.nextInt();
		circleDiameter = circleRadius*2;
		circleCircumference = circleDiameter*Math.PI;
		circleArea = circleRadius*circleRadius*Math.PI;

	}

	
	@Override
	public String toString() {
		return String.format("Circle Details\n Diameter: %d"+
			"\n Circumference: %.3f\n Area: %.3f", 
			circleDiameter, circleCircumference, circleArea);
	}

	public static void main(String[] args) {
		Circle circle = new Circle();

		System.out.println(circle.toString());
		
	}
}
