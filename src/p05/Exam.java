package p05;

public class Exam {
	
	public static int getFoodPriceSum(int fp1, int fp2, int fp3, int fp4, int fp5) {
		return fp1 + fp2 + fp3 + fp4 + fp5;
	}

	public static void main(String[] args) {
		String foodName = "삼겹살";
		int foodPrice = 15000;
		String foodType = "한식";
		
		String foodName2 = "치킨";
		int foodPrice2 = 25000;
		String foodType2 = "한식";
		
		String foodName3 = "짜장면";
		int foodPrice3 = 7000;
		String foodType3 = "중식";
		
		String foodName4 = "마라탕";
		int foodPrice4 = 15000;
		String foodType4 = "중식";
		
		String foodName5 = "돈가스";
		int foodPrice5 = 10000;
		String foodType5 = "일식";
		
		int priceSum = getFoodPriceSum(foodPrice, foodPrice2, foodPrice3, foodPrice4, foodPrice5);
		System.out.print(priceSum);
	}
}