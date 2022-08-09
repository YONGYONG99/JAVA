package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import test.util.DBConnect;

public class MainClass06 {
	public static void main(String[] args) {
		//member_seq 이라는 시퀀스를 이용해서 아래의 회원정보를 추가 하고자 한다.
		String name="원숭이";
		String addr="상도동";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			//DBConnect 객체를 이용해서 Connection 객체의 참조값을 가져온다.
			conn=new DBConnect().getConn();
			String sql="INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";
			//PreparedStatement 객체 얻어내기
			pstmt=conn.prepareStatement(sql); //미완성
			//? 바인딩 하렉 있으면 바인딩 한다.
			pstmt.setString(1, name); //미완성인걸 완성시켜주는 기능
			pstmt.setString(2, addr);
			//실행
			pstmt.executeUpdate(); //sql문을 실행시켜주는 기능
			System.out.println("회원 정보를 저장했습니다.");
			
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }finally {
	    	 try {
	    		 if(pstmt!=null)pstmt.close();
	    		 if(conn!=null)conn.close();
	    	 }catch(Exception e) {}
	      }	
		
	}

}
