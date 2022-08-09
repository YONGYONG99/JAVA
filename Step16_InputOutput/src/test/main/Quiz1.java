package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 *  Scanner 객체를 이용해서 문자열 한줄을 입력 받은 다음
		 *  c:/acorn202206/myFolder/quiz.txt 파일을 망들어서 
		 *  해당 파일에 문자열을 저장해 보세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력하세요: ");
		String str = scan.nextLine();
		
		FileWriter fw=null;
		try {
			fw = new FileWriter("c:/acorn202206/myFolder/quiz.txt" , true);
			fw.write(str);
			fw.flush();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}	
	}
}



