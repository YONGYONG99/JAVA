package test.main;

import test.mypac.HandPhone;
/*
 * Phone 클래스를 상속받은 HandPhone 클래스로 객체를 생성하면
 * Phone 객체가 미리 만들어지고 HandPhone 객체가 만들어지낟.
 * 그리고 그 두개의 개체가 동일한 heap영역에 저장되어서 동일한 참조값으로 관리가 된다.
 */

public class MainClass01 {
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		p1.call(); //부모로 부터 상속받은 기능을 사용한다고 볼수 있다.
		p1.mobileCall();
		p1.takePictue();
		
		
	}

}
