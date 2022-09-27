package t25;

public class SumOfArrrayValues {
	public static void main(String[] args) {
		int sum = 0;
		int[] array= {10,20,30,40,50,100};
		for( int num : array) 
		{
		sum = sum+num;
		}
		System.out.println("Sum of array elements is:"+sum);
	}

}
