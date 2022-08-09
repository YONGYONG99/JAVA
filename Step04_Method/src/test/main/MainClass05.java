package test.main;

import test.mypac.Messenger;
import test.mypac.Radio;


public class MainClass05 {
	public static void main(String[] args) {
		//Messenger 클래스의 sendMessage() , getMessage() , useRadio()메소드를 호출해 보세요
		
		Messenger.sendMessage("hi");
		String a = Messenger.getMessage();
		Messenger.useRadio(new Radio());
		
		System.out.println(a);
		
	}

}
