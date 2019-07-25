package co.grandcircus;

public class Circle {
	
	private double circleRadius;
//	private double area;
//	private double circumference;
	
	
	
	public Circle() {
		
	}
	public double getRadius() {
		return circleRadius;
	}
	
	public void setRadius(double radius) {
		circleRadius = radius;
	}
	
	public Circle(double radius) {
		circleRadius =  radius;
	}
	
	public double getCircumference() {
		return 2 * (Math.PI * circleRadius);
	}
	
	public double getArea() {
		return Math.PI * Math.pow(circleRadius, 2);
	}
	
	private static String formatNumber(double x) {
		return String.format("%.2f", x);
	}
	
	public String getFormattedCircumference() {
		return "Circumference: " + formatNumber(getCircumference()); 
	}
	
	public String getFormattedArea() {
		return "Area: " + formatNumber(getArea());
	}
	
}
