package p08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoList {

	public static void main(String[] args) {
		List<Integer> lotto = new ArrayList<>();
		Random ra = new Random();
		 // indexOf()가 -1이면 없는 것. 중복 제거 가능
		for(int i=0; i<6; i++) {
			int rNum = ra.nextInt(45) + 1;
			if(lotto.indexOf(rNum) == -1) {
				lotto.add(rNum);
			}else {
				i--; // 해당 인덱스 for문이 다시 돌아가도록 !!!!!!
			}
		}
		
		// 출력
		for(int i=0; i<lotto.size(); i++) {
			System.out.println(lotto.get(i));
		}
		
	}

}
