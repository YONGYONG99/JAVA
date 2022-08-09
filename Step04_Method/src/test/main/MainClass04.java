package test.main;

import test.mypac.Arrow;
import test.mypac.Gun;
import test.mypac.MyObject;
import test.mypac.Radio;

public class MainClass04 {
	public static void main(String[] args) {
		MyObject obj = new MyObject();
		obj.setNum(999);
		obj.setName("kim");
		
		//useRadio() 메소드도 호출해보세요.
		obj.useRadio(new Radio());
		//둘다 가능
		Radio r1=new Radio();
		obj.useRadio(r1);
		
		//attack() 메소드를 호출해 보세요
		obj.attack(new Gun() , new Arrow());	
	}

}
