package p09;

import java.util.ArrayList;
import java.util.List;

public class ListTest5 {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(1);
		numList.add(35);
		numList.add(17);
		numList.add(4);
		int temp = 0;
		
		// Selection Sort
		for(int i=0; i<numList.size(); i++) {
			for(int j=i+1; j<numList.size(); j++) {
				if(numList.get(i)>numList.get(j)) {
					temp = numList.get(i);
					numList.set(i, numList.get(j));
					numList.set(j, temp);
				}
			}
		}
		for(int i=0; i<numList.size(); i++) {
			System.out.println(numList.get(i));
		}
		

	}

}
