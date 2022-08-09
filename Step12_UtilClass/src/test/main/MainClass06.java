package test.main;

import java.util.ArrayList;

import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		//1. Car type을 저장할수 있는 ArrayList 객체를 생성해서
		//참조값을 ArrayList type 지역변수 cars에 담아 보세요.
		ArrayList<Car> cars = new ArrayList<Car>();
		
		//2. Car 객체(3개를)를 생성해서 ArrayList 객체에 저장해 보세요.
		Car car1=new Car("소나타");
		cars.add(car1);
		//방법1
		cars.add(new Car("그렌져"));
		cars.add(new Car("제네시스"));
		//방법2
		
		//3. 반복문 for 문을 이용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를
		//순서대로 호출해 보세요.	
	    for(int i=0; i<cars.size(); i++) {
	         cars.get(i).drive();
	    }
	    //방법1
	    for(Car tmp:cars) {
	    	tmp.drive();
	    }
		//방법2
		
	}

}
