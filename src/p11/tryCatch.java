package p11;

public class tryCatch {
	public static int changeStringToInt(String str) throws Exception {
		try {
			return Integer.parseInt(str);
		}catch(Exception e){
			throw new Exception("숫자 쓰라고!");
		}
	}
	
	public static void main(String args[]) throws Exception {
		int num;
		try {
			num = changeStringToInt("onetwo");
			System.out.println(num);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램이 종료되었습니다.");		
	}
}