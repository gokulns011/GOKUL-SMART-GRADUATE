package pariallyopenbook1;

import java.util.Arrays;

public class Search {
	static void check(int[] arr, int toCheckValue)
    {
    boolean test = false;
    for (int element : arr) 
    {
    if (element == toCheckValue) 
    {
    test = true;
    break;
    }
    }
 	System.out.println(toCheckValue+ " is present in the array");
    }
 	public static void main(String[] args)
    {
    int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
    int toCheckValue = 7;
    System.out.println("Array: "+ Arrays.toString(arr));
    check(arr, toCheckValue);
    }

}
