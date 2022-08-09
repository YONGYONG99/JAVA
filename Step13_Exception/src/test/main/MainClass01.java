package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자입력:");
		//숫자 형식의 문자열을 입력 받는다 "10" "20" "10.1" 등등
		String inputNum=scan.nextLine();
		try {
			//입력한 숫자를(문자열) 실제 숫자로 바꾼다.
			double num = Double.parseDouble(inputNum);
			//입력한 숫자에 100을 더한다.
			double result=num+100;
			System.out.println("입력한 숫자 + 100 :"+result);
		}catch(NumberFormatException nfe) { //해당 예외객체가 생성되는것 / nfe는 맘대로 지은것
			System.out.println("오잉 예외?");
			System.out.println(nfe.getMessage()); //참조값에 . 찍어서 특정기능 수행
			//콘솔에 자세한 경고 메시지 출력하기
			nfe.printStackTrace();
			
		}
		System.out.println("무언가 중요한 마무리 작업을 하고 main 메소드가 종료됩니다.");
	}

}
