package t25;

import java.util.Scanner;

public class FindAreaOfSquare {
public static void main(String[] args) {
	System.out.println("Enter Side of Square:");
	Scanner r = new Scanner(System.in);
	double side = r.nextDouble();
	double area = side*side;
	System.out.println("Area of Square is: "+area);
	
}
}
