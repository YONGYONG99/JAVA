package test.main;

import java.io.File;
import java.io.IOException;

public class Mainclass04 {
	public static void main(String[] args) {
		File f = new File("c:/acorn202206/myFolder/memo.txt");
		
		//실제로 파일이 만들어지는 확인해 보세요
		try {
			f.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료 됩니다.");
	}

}
