package p07;

public class SchoolExec {
	public static void main(String avgs[]) {
//		Object obj = new MiddleSchool(); // 메모리는 MiddleSchool로 생성, 데이터 타입은 Object
//		obj는 아무 것도 사용하지 못함. 데이터 타입이 달라서임
//		MiddleSchool ms = (MiddleSchool)obj; // casting
//		System.out.println(ms.studentType);
		
		School middleSchool = new MiddleSchool();
		middleSchool.name = "양주";
		
		School highSchool = new HighSchool();
		highSchool.name = "양주고등학교";
		
		School school = new School();
		school.name = "학교";
		
		School[] schools = new School[3];
		schools[0] = middleSchool;
		schools[1] = highSchool;
		schools[2] = school;
	}
}