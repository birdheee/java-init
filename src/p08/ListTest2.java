package p08;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListTest2 {
	
	public static void main(String[] avgs) {
		float[] fls = new float[3];
		fls[0] = 1.1f;
		fls[1] = 22.2f;
		fls[2] = 0.1111f;
		
		char[] chars = new char[3];
		chars[0] = 'a';
		chars[1] = 'b';
		chars[2] = 'c';
		
		String[] strs = new String[3];
		strs[0] = "우리";
		strs[1] = "모두";
		strs[2] = "파이팅!";
		
		ArrayList<Float> flArray = new ArrayList<Float>();
		for(int i=0; i<fls.length; i++) {
			flArray.add(fls[i]);
		}
		
		ArrayList<Character> charArray = new ArrayList<Character>();
		for(int i=0; i<chars.length; i++) {
			charArray.add(chars[i]);
		}
		
		ArrayList<String> strArray = new ArrayList<String>();
		for(int i=0; i<strs.length; i++) {
			strArray.add(strs[i]);
		}
		
		// 출력
		for(int i=0; i<flArray.size(); i++) {
			System.out.println(flArray.get(i));
		}
		
		for(int i=0; i<charArray.size(); i++) {
			System.out.println(charArray.get(i));
		}
		
		for(int i=0; i<strArray.size(); i++) {
			System.out.println(strArray.get(i));
		}
	}
	
}