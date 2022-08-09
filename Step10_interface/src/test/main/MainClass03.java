package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		Remocon r1 = new Remocon() {//익명클래스
			         //new Remocon()은 생성자를 호출
			@Override
			public void up() {
				System.out.println("커튼을 올려요");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void down() {
				System.out.println("커튼을 내려요");
				// TODO Auto-generated method stub
				
			}
		};
		useRemocon(r1);
		
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("피치를 올려요");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void down() {
				System.out.println("피치를 내려요");
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}

}
