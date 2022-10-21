class base{
	String method() {
		return "super";
	}
}
class derived{
	public void used() {
		base z=new base();
		System.out.println("base class says, "+z.method());
	}
}
public class ex25 {
	public static void main(String[] args) {
		derived d=new derived();
		d.used();
	}

}