package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * ArrayList 객체에
		 * 
		 * 친구 이름 5개를 담고
		 * 
		 * 반복문 돌면서 친구이름을 다음과 같은 형식으로 출력해 보세요.
		 * 
		 * 0 번째 친구 : 김구라
		 * 1 번째 친구 : 해골
		 * 2 번째 친구 : 원숭이
		 * 
		 */
		ArrayList<String> friends  = new ArrayList<String>();
		
		friends.add("김구라");
		friends.add("해골");
		friends.add("원숭이");
		
		int size = friends.size();
		
		for(int i=0; i<size ; i++) {
			System.out.println(i+" 번째 친구 : "+ friends.get(i));
		}
		
		
	}

}
