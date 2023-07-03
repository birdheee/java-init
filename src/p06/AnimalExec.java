package p06;
//Animal.hunt(); non-static이기 때문에 오류
//non-static은 반드시 new(메모리 생성)을 해야함
//static은 할 필요 없음

public class AnimalExec {
	
	public static void printAnimals(Animal animals[]) {
		for(Animal a : animals) {
			if(!a.name.equals("냥이")) {
				a.hunt();
			}
			if("새".equals(a.type)) { // cat.type이 null일 때, 이렇게 해야 nullPoint 에러가 안남
				a.fly();
			}
			a.eat();
			a.run();
		}
	}

	public static void main(String[] args) {
		Animal tiger = new Animal();
		tiger.name = "호돌이";
		tiger.type = "호랑이";
		
		Animal cat = new Animal();
		cat.name = "냥이";
//		cat.type = "고양이";
		
		Animal bird = new Animal();
		bird.name = "짹짹이";
		bird.type = "새";
		
		Animal[] animals = new Animal[3]; // 데이터 타입이 Animal 배열
		animals[0] = tiger;
		animals[1] = cat;
		animals[2] = bird;
		
		printAnimals(animals);
	}

}