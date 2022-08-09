package test.auto;

public class CampingCar extends Car {
	//Engine type을 전달 받는 생성자
	public CampingCar(Engine engine) {
		//부모 생성자를 호출하면서 필요한 값을 전달해준다.
		super(engine);
		// TODO Auto-generated constructor stub
	}
	public void driveCooking() {
		System.out.println("차안에서 밥해먹어요");
	}
}
