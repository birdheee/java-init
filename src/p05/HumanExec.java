package p05;

public class HumanExec {
	
	public static int getSum(Human[] human) {
		int sum = 0;
		for(Human h : human) {
			sum += h.money;
		}
		return sum;
	}
	
	public static int getAvg(Human[] human, int sum) {
		int avg = 0;
		for(Human h : human) {
			avg = sum/human.length;
		}
		return avg;
	}
	
	public static void printRich(Human[] human, int avg) {
		String richNames = "";
		for(Human h : human) {
			if(h.money >= avg) {
				richNames += h.name + "님, ";
			}
		}
		richNames = richNames.substring(0, richNames.length()-2);
		System.out.println(richNames + "은 부자입니다. 나머지는 거지입니다.");
	}

	public static void main(String[] args) {
		
		Human[] human = new Human[5];
		
		human[0] = new Human();
		human[0].name = "김아영";
		human[0].money = 10000; 
		
		human[1] = new Human();
		human[1].name = "임도경";
		human[1].money = 7000;
		
		human[2] = new Human();
		human[2].name = "이지희";
		human[2].money = 15000;
		
		human[3] = new Human();
		human[3].name = "정진희";
		human[3].money = 9000;
		
		human[4] = new Human();
		human[4].name = "이윤경";
		human[4].money = 8000;
		
		int sum = getSum(human);
		System.out.println("총합 : " + sum + "원");
		int avg = getAvg(human, sum);
		System.out.println("평균 : " + avg + "원");
		printRich(human, avg);
	}

}
