package test.main;
//추상클래스 최종버전
import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		Weapon w1 = new Weapon() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				
			}
		};
		useWeapon(w1);
		
		//w1 지역변수도 굳이 만들어야되?
		//지역변수 만들지 않고 바로 익명클래스로 객체 생성후 참조값 전달하기
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				
			}
		});
	}
		
	
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
