package t25;

import java.util.Scanner;

public class FindAreaOfCircle {
public static void main(String[] args) {
	Scanner r = new Scanner(System.in);
	System.out.print("Enter the radius: ");
	double radius = r.nextDouble();
	double area = Math.PI * (radius * radius);
	System.out.println("The area of circle is: " + area);
	double circumference= Math.PI * 2*radius;
	System.out.println( "The circumference of the circle is :"+circumference);
}
}
