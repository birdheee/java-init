package p05;

public class FoodExec {
	public static void printFood(Food[] foods) {
		for(Food f : foods) {
			System.out.println("음식 이름 : " + f.name);
			System.out.println("가격 : " + f.price);
			System.out.println("타입 : " + f.type);
		}
	}
	
	public static void main(String[] args) {
		// 메모리 생성 가능
		
		Food f1 = new Food();
		f1.name = "삼겹살";
		f1.price = 15000;
		f1.type = "한식";
		
		Food f2 = new Food();
		f2.name = "벤틀리의 잉글리쉬 블랙퍼스트";
		f2.price = 8000;
		f2.type = "양식";
		
		Food f3 = new Food();
		f3.name = "꿔바로우";
		f3.price = 18000;
		f3.type = "중식";
		
		Food f4 = new Food();
		f4.name = "순두부찌개";
		f4.price = 8000;
		f4.type = "한식";
		
		Food f5 = new Food();
		f5.name = "초밥 정식";
		f5.price = 13000;
		f5.type = "일식";
		
		
		// 참조형의 아무것도 아닌 값은 null
		Food[] foods = new Food[5];
		System.out.println(foods[0]); //null
//		System.out.println(foods[0].name); // nullPointException
		
		foods[0] = f1;
		foods[1] = f2;
		foods[2] = f3;
		foods[3] = f4;
		foods[4] = f5;
		
		printFood(foods);

	}
}