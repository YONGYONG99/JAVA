package test.main;


import test.mypac.MyWeapon1;
import test.mypac.Weapon;

public class MainClass02 {
	

	public static void main(String[] args) {
	/*
	 * 여러분이 직접 클래스를 만들고 객체 생성을 해서 아래의 useWeapon() 메소드를 호출해보세요.
	 * 클래스명도 마음대로... attack 메소드 안에서 어떤 동작을 할지 마음대로...
	 * 테스트후 작성한 클래스와 main() 메소드안에 작성한 코드를 카톡으로 공유해 보세요.
	 */
	
		Weapon w1 = new MyWeapon1();
		MainClass02.useWeapon(w1);
	
	}
	
	
	
	//이 메소드는 미리 준비된 메소드이고 아주 특별한 동작을 하는 메소드라고 가정하자
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		System.out.println("잠시 휴식후...");
		w.attack();
		
	}
	
	
}
