package test.main;



//1. 객체를 생성하는데 필요한 클래스 import 
import test.mypac.Calculator;


public class MainClass01 {
	
	
	public static void main(String[] args) {
		/*
		 * 만일 프로그래밍의 목적이 '계산' 이라면?
		 * 
		 * - 계산기능을 수행할수 있는 객체가 필요하다.
		 * - 계산기능을 수행할수 있는 객체를 생성해서 heap 영역에 올려놓고
		 * - 참조값을 이용해서 계산을 해야한다.
		 * 
		 */
		
		//2. 객체를 생성한다.
		Calculator cal = new Calculator(); //설계도를 이용해서 실제 물건을 만드는 단계
		//클래스명이 즉 타입이 된다.
		//new Calcu... ctrl + space 하면 위에 import도 자동 완성된다.
		
		//Calculator 객체의 exec() 메소드 호출하기
		cal.exec();
		
		//Calculator 객체의 brand 필드 참조하기
		String a = cal.brand; // 참조된 값을 변수에 대입하기
		
		
		
	}

}
