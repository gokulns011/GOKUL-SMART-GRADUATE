package t25;

import java.util.Scanner;

public class FindAreaOfTriangle {
public static void main(String[] args) {
	Scanner r = new Scanner(System.in);
	System.out.println("Enter the width of the Triangle:");
	double base = r.nextDouble();
	System.out.println("Enter the height of the Triangle:");
	double height =r.nextDouble();
	double area = (base* height)/2;
	System.out.println("Area of Triangle is: " + area);
}
}
