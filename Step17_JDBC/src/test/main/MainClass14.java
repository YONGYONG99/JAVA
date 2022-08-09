package test.main;

import java.sql.Connection;
import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		int num=3;
		String name="라면";
		String addr="김밥천국";
		
		/*
		 * 위의 정보는 수정할 회원의 정보이다.
		 * 성공이면 "회원정보를 수정 했습니다"
		 * 실패면 "수정 실패!"
		 * 를 콘솔창에 출력하는 code를 작성해 보세요.
		 */
		
		//수정할 회원의 정보를 MemberDto 객체를 생성해서 담는다.
		MemberDto dto=new MemberDto(num, name, addr);

		
		//MemberDao 객체를 이용해서 수정한다.
		MemberDao dao = new MemberDao();
		
		boolean isSuccess = dao.update(dto);
		
		if(isSuccess) {
			System.out.println("수정 성공");
		}else {
			System.out.println("수정 실패");
		}
	}

}