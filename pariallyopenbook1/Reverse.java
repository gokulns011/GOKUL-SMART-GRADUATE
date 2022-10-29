package pariallyopenbook1;

public class Reverse {
	public static void main(String[] args) {
        int[] arr={30,69,19,25,22,40};
        Reverse(arr);
        System.out.println("The elements of the array after reversing are :- ");
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]+" ");
        }
    }

    public static void Reverse(int[] arr){
        int temp;
        for (int fidx = 0, bidx = arr.length - 1; fidx < bidx; ++fidx, --bidx)
        {
        temp=arr[bidx];
        arr[bidx]=arr[fidx];
        arr[fidx]=temp;
        }
    }

}
