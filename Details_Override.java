package methodoverride.com;

public class Details_Override extends Student_Override {
     
	@Override
	public void name(String name) {
		super.name(name);
	}
	@Override
	public void age(int age) {
		super.age(age);
	}
	@Override
	public void gender(char g) {
		super.gender(g);
	}
	@Override
	public void fees(float f) {
		super.fees(f);
	}
	public static void main(String[] args) {
		Details_Override obj = new Details_Override();
		obj.name("Pandian");
		obj.age(22);
		obj.gender('F');
		obj.fees(12300f);
	}
//	public static void main(int[] args) {
//		Details_Override obj = new Details_Override();
//		obj.name("vijay");
//		obj.age(42);
//		obj.gender('f');
//		obj.fees(13250f);
//	}
}
