package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MainClass16 {
	public static void main(String[] args) {
		//1. HashSet 객체를 생성해서 참조값을 정수를 저장할수 있는 Set 인터페이스 type 변수에 담아보세요.
			Set<Integer> set = new HashSet<>();
		
		/*
		 * 2. 반복문 돌면서 1~45 사이의 랜덤한 정수를 얻어내서 HashSet 객체에 담아 보세요
		 * 	  총 6개가 담길때 까지 반복문이 돌아야 합니다.
		 * 	  주의) 우연히 이전에 나왔던 동일한 숫자가 나오면 HashSet 은 하나만 저장하는걸 잊지 마세요.
		 */
			
			Random ran = new Random();
			
			while(true) {			
				int ranNum = ran.nextInt(45)+1;
				set.add(ranNum);
				//만일 Set의 사이즈가 6이 되면
				if(set.size()==6) { //set.size()>5 도 가능
					break;//반복문 탈출하기
				}
			}
		
		//3. HashSet 객체에 담긴 숫자를 콘솔창에 하나하나씩 모두 출력해 보세요.
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int nums1 = it.next();
			System.out.println(nums1);
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
