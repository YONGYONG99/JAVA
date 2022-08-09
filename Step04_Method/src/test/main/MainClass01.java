package test.main;

import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		//MyObject 클래스에 정의된 3개의 메소드를 차례로 호출하는 code 를 작성해보세요
		MyObject obj = new MyObject();
		
		obj.walk();
		int a = obj.getNumber();
		String b = obj.getGreeting();
		
		
	}

}
