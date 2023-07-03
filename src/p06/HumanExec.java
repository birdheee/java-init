package p06;

public class HumanExec {
	
	public static void printMaxHuman(Human people[]) {
		Human maxHuman = people[0];
		for(int i=1; i<people.length; i++) {
			if(maxHuman.age<people[i].age) {
				maxHuman = people[i];
			}
		}
		System.out.println("최고령자는 " + maxHuman.name + "님 입니다.");
	}
	
	public static void printMinHuman(Human people[]) {
		Human minHuman = people[0];
		for(int i=1; i<people.length; i++) {
			if(minHuman.age>people[i].age) {
				minHuman = people[i];
			}
		}
		System.out.println("최연소는 " + minHuman.name + "님 입니다.");
	}
	
	public static void printAvgHuman(Human people[]) {
		int sum = 0;
		int avg = 0;
		for(int i=0; i<people.length; i++) {
			sum += people[i].age;
		}
		avg = sum/people.length;
		Human avgHuman = people[0];
		for(int i=1; i<people.length; i++) {
			if(Math.abs(avg - avgHuman.age)>Math.abs(avg - people[i].age)) {
				avgHuman = people[i];
			}
		}
		System.out.println("평균과 가장 가까운 사람은 " + avgHuman.name + "님이고, " + avgHuman.age + "세 입니다.");
	}
	
	

	public static void main(String[] args) {
		// 5명 랜덤
		// 5명 휴먼 배열
		// 반복물을 사용하여 최고령 최연소가 누군지 출력
		
		Human human1 = new Human();
		human1.name = "벨";
		human1.age = 25;
		
		Human human2 = new Human();
		human2.name = "샘";
		human2.age = 24;
		
		Human human3 = new Human();
		human3.name = "벤틀리";
		human3.age = 23;
		
		Human human4 = new Human();
		human4.name = "자스민";
		human4.age = 22;
		
		Human human5 = new Human();
		human5.name = "오로라";
		human5.age = 21;
		
		Human[] people = new Human[5];
		people[0] = human1;
		people[1] = human2;
		people[2] = human3;
		people[3] = human4;
		people[4] = human5;
		
		printMaxHuman(people);
		printMinHuman(people);
		printAvgHuman(people);
	
	}

}
