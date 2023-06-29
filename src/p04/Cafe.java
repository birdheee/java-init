package p04;

public class Cafe {
	public static String getCoffee(String order, int price) {
		int coffePrice = 100000;
		if(price < coffePrice) {
			return("돈이 모자릅니다. " + (coffePrice - price) + "원 더 내시던지 나가세요."); // 이 조건문을 돌면 return 후 종료함. 뒤에 return 안 함!
		}
		String str = "";
		if(price > coffePrice) {
			str = " 거스름돈은 " + (price - coffePrice) + "원 입니다. 근데 제가 가질게요.";
		}
		return "안녕하세요. 샘 님. 주문하신 " + coffePrice + "짜리 " + order + "가 준비되었습니다." + str;
	}
	
	public static void main(String[] args) {
		String coffee = getCoffee("아아에 타피오카 펄 추가", 100500);
		System.out.println(coffee);
	}
}