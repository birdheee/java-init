package p02;

public class AreaTour {
	
	String areaName;
	int tourPrice;
	String hotelName;
	String tourCar;
	
	// 10개의 areaName이 있으면 40개의 변수가 필요하다. 1개가 4개를 가지고 있다.

	public static void main(String[] args) {
		AreaTour ar1 = new AreaTour();
		ar1.areaName = "지역1";
		ar1.tourPrice = 1;
		ar1.hotelName = "호텔1";
		ar1.tourCar = "버스1";
	}
}