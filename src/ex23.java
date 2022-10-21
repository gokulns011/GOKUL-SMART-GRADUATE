public class ex23 {
	g ex=new g();
	void manipulate (int a) {
		System.out.println("the number is "+ex.num);
		System.out.println("manipulating a protected member from other class....");
		ex.num=a;
		System.out.println(ex.num);
	}

	public static void main(String[] args) {
		ex23 ex1=new ex23();
		ex1.manipulate(5);
		System.out.println("manupulated successfully...");

	}

}
class g{
	protected int num=10;
}