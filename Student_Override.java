package methodoverride.com;

public class Student_Override {

	public void name(String name) {
       System.out.println(name);
	}
	public void age(int age) {
       System.out.println(age);
	}
	public void gender(char g) {
      System.out.println(g);
	}
	public void fees(float f) {
      System.out.println(f);
	}
	public static void main(String[] args) {
		Student_Override so = new Student_Override();
		so.name("kp");
		so.age(12);
		so.gender('M');
		so.fees(25000f);
	}	
}
