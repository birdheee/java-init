package p07;

public class ThisClass {
	String name = "경동대";
	
	public void printName() {
		String name = "민국대";
		System.out.println(name);
		System.out.println(this.name);
	}
	
	public static void main(String avgs[]) {
		ThisClass tc = new ThisClass();
		tc.printName();
	}
}