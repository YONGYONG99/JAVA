package test.mypac;
/*
 * Member 객체에 회원의 번호 , 이름 , 주소 를 담고 싶다면
 * 클래스를 어떻게 설계를 해야 할까???
 * 
 * 저장소(필드)가 3개 필요하다
 * 필드의 type 은 int , String , String 이 적당할것 같음
 * 
 */
public class Member {//public은 공용,공개의 의미 어디서든 접근이 가능하게함 이게 없으면 다른 package인 mainclass03에서 참조할수 없음
	public int num; // '=0' 생략가능
	public String Name; // '=null' 생략가능
	public String Addr;
	
	//메소드에서 자신의 필드를 참조해볼까?
	public void showInfo() {
		System.out.println("번호:"+this.num+" 이름:"+this.Name+" 주소:"+this.Addr);
		//this는 객체 자신의 참조값을 가리키는 예약어
	}
	
}
