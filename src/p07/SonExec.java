package p07;
// Objects를 확장시킨 것이 Father, Father를 확장시킨 것을 Son
// 범위는 아들이 더 큼
// 하나의 클래스는 하나만 바라봄

public class SonExec {

	public static void main(String[] args) {
		// 모든 클래스는 Object를 바라봄(중요)
		Object str = new String("123");
		
		Son s = new Son();
		s.name = "SAM"; // Father에서 나온 것
		s.job = "개발자";
		s.age = 30;
		s.hobby = "야구 보기";
		s.printJob();
		s.printHobby();
		
		Father f = new Son(); // 메모리 생성은 Son, 데이터 타입은 Father
		f.name = "SAM 아버님";
//		f.hobby 사용할 수 없음
		Son s2 = (Son)f; // 하위 개념으로 캐스팅
		s2.hobby = "낚시"; // 사용할 수 있음
		System.out.println(s2.name); // f와 s2는 같은 것
		
		Father f2 = new Father(); // 메모리 생성은 Father, 데이터 타입도 Father
		f2.name = "취미가 없는 아버님";
//		f.hobby 사용할 수 없음, 캐스팅도 안됨
		
	}

}