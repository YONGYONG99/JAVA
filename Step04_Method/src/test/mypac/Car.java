package test.mypac;

public class Car {
	
	//생성자 (객체 new 할때 호출되는 부분) 클래스명이랑 똑같아야됨 메소드가 아니기때문에 return없다
	 Car(){ //클래스명()
		System.out.println("Car 생성자 호출됨!");
		
	}
	//non static 메소드
	public void drive() {
		System.out.println("달려요!");
	}

}
