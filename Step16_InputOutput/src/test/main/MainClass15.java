package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass15 {
	public static void main(String[] args) {
		//필요한 참조값을 담을 지역 변수를 미리 만든다.
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			//1.jpg 에서 byte 를 읽어낼 객체
			fis=new FileInputStream("c:/acorn202206/myFolder/1.jpg");
			//copied.jpg 에 byte 를 출력할 객체
			fos=new FileOutputStream("c:/acorn202206/myFolder/copied.jpg");
			while(true) {
				//1byte 씩 읽어내고 
				int data=fis.read();
				System.out.println(data);
				//만일 더이상 읽을 데이터가 없다면 
				if(data==-1) {
					break;//반복문 탈출
				}
				//읽어낸 만큼 출력
				fos.write(data);
				fos.flush();//방출
			}System.out.println("끝");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//fos, fis 마무리하기
			try {
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();
			}catch(Exception e) {}
		}
	}
}


