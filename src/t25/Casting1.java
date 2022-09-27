package t25;

public class Casting1 {
	public static void main(String[] args) {
		byte b=10;
		int i=b;
		byte d=(byte)i;
		byte x=30;
		byte y=30;
		int xy= (byte)(x*y);
		System.out.println("b=\t"+b);
		System.out.println("i=\t"+i);
		System.out.println("x=\t"+x);
		System.out.println("y=\t"+y);
		
	}

}
