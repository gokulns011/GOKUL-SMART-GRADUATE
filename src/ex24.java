import java.util.Scanner;
class g{
	int a;
	int b;
	int c;
	int x;
	
	g(int num1,int num2,int num3){
		a=num1;
		b=num2;
		c=num3;
	}
	int calculate(int num){
		x=(a*num*num)+(b*num)+c;
		return x;
	}
}

public class ex24 {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.println("enter four numbers a,b,c and x :");
		int a=r.nextInt();
		int b=r.nextInt();
		int c=r.nextInt();
		int x=r.nextInt();
		g eq=new g(a,b,c);
		int fx=eq.calculate(x);
		System.out.println(fx);
	

	}

}