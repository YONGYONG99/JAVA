package test.main;

//Car 객체를 생성할 설계도를 import 한다.
import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		//달리고 싶다~ 어떻게 하면 달릴수 있을까?
		
		Car c1 = new Car();
		
		c1.drive();
		c1.drive();
		c1.drive();
		
		//위에서 달린 차의 이름을 carName 이라는 지역변수에 담아보세요.
		
		String carName = c1.name;			
	}

}
