class y{
	public int a=10;
	private int g=20;
	protected int c=30;
	int d=40;
	public void test0() {
		System.out.println("inside public method..");
	}
	protected void test2(){
	System.out.println("inside protected method...");	
	}
	void test3() {
		System.out.println("inside default method...");
	}
}
public class ex22 {

	public static void main(String[] args) {
		y m=new y();
		System.out.println(m.a);
		System.out.println(m.c);
		System.out.println(m.d);

		
	}}