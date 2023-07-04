package p07;

class Mother{
	public void work() {
		System.out.println("어머님이 집안일을 하십니다.");
	}
}

class Daughter extends Mother{
	public void work() {
		System.out.println("딸이 출근을 합니다.");
	}
	// 오버로딩
	public void work(String job) {
		System.out.println("딸이 " + job + "을 합니다");
	}
}

public class Overriding2 {
	
	public static void work(Mother[] ms) {
		for(int i=0; i<ms.length; i++) {
			Mother m = ms[i];
			if(m instanceof Daughter) {
				Daughter dt = (Daughter)m; // 딸로 캐스팅
				dt.work("개발"); // 호출할 수 있음
			}else {
				m.work();
			}
		}
	}
	public static void main(String[] args) {
		Daughter d = new Daughter();
		d.work(); // 메모리 생성을 누가 했냐에 따라 호출되는 메소드가 다름
		d.work("개발");
		
		Mother m = new Mother();
		m.work();
		
		System.out.println(d instanceof Mother); // true
		System.out.println(m instanceof Mother); // true
		System.out.println(d instanceof Daughter); // true
		System.out.println(m instanceof Daughter); // false
		
		Mother[] ms = new Mother[2];
		ms[0] = d;
		ms[1] = m;
		
		work(ms);
		
	}

}
