package test.main;

import java.sql.Connection;
import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass15 {
	public static void main(String[] args) {
		//삭제할 회원의 번호(primary key)
		int num=6;

		
		/*
		 * MemberDao 객체를 이용해서 위의 번호에 해당하는 회원정보를 삭제해보세요.
		 * 성공이면 "회원정보를 삭제 했습니다"
		 * 실패면 "삭제 실패!"
		 * 를 콘솔창에 출력하는 code를 작성해 보세요.
		 */
		
		//추가할 회원의 정보를 MemberDto 객체를 생성해서 담는다.
		

		
		//MemberDao 객체를 생성해서
		MemberDao dao = new MemberDao();
		//insert() 메소드를 이용해서 회원의 정보를 추가하고 성공여부를 리턴 받는다.
		boolean isSuccess = dao.delete(num);
		
		if(isSuccess) {
			System.out.println("회원정보를 삭제했습니다");
		}else {
			System.out.println("삭제 실패");
		}
	}

}