package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		//SmartPhone 객체를 생성해서 Phone type p1 이라는 지역변수에 담아 보세요.
		Phone p1 = new SmartPhone();
		//p1 에 들어 있는 참조값을 이용해서 전화걸기
		p1.call();
		//p1에 들어 있는 참조값을 이용해서 이동중에 전화걸고 싶다면?
		HandPhone p2 = (HandPhone)p1; //HandPhone type 으로 casting 해서 p2 에 담는다. 
		p2.mobileCall();
		
		//p1 에 들어 있는 참조값을 이용해서 인터넷 하고싶으면?
		SmartPhone p3 = (SmartPhone)p1;
		p3.doInternet();
		
		
		
		
	}

}
