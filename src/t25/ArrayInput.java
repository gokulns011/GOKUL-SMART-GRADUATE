package t25;

import java.util.Scanner;

public class ArrayInput {
	public static void main(String[] args) {
	Scanner r = new Scanner(System.in);
	int[] array = new int[10];
	int sum = 0;
	
	System.out.println("Enter the elements:");
	System.out.println("only 10 element");
	for (int i=0; i<10; i++)
	{
	array[i] = r.nextInt();
	}
	for( int num : array) {
	sum = sum+num;
	}
	System.out.println("Sum of array elements is:"+sum);
	}

}
