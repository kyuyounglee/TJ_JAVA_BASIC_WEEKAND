package com.java.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
// DB의 클래스의데이터를 사용하기위해 만들 객체
// 테이블 컬럼에 해당하는 변수
// getter / setter
// 적절한 생성자
// toString()
class PersonVO{
	private String name,phone,email;
	public PersonVO() {}
	public PersonVO(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "PersonVO [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}	
}

public class DBTest {
	static String url = "jdbc:mysql://localhost/contackts";
	static String id = "root";
	static String psw = "1234567!";

	public static void main(String[] args) {
		// 데이터 베이스 접속(데이터베이스 정보를 가지고)
		try(Connection con = DriverManager.getConnection(url, id, psw);
				Statement stmt = con.createStatement();
				)
		{
			// 드라이버를 로드
			Class.forName("com.mysql.cj.jdbc.Driver");					 
			System.out.println("접속성공");						
			
			String sql = "select * from person";		
			ResultSet rs = stmt.executeQuery(sql); 
			
			List<PersonVO> list = new ArrayList<>();
			while (rs.next()) {
				PersonVO pvo = new PersonVO(rs.getString("name")
						, rs.getString("phone")
						, rs.getString("email")
						);
				list.add(pvo);
			}
			
			// 데이터 확인
			for (PersonVO pVO : list) {
				System.out.println(pVO);
			}
			
			// update 구문
			PersonVO updateVo = new PersonVO();
			updateVo.setName("영희");
			updateVo.setPhone("000-000-0000");
			sql = "update person set name = " +
					"'" +
					updateVo.getName()+
					"'" + 
					" where phone =" +
					"'" +
					updateVo.getPhone()+					
					"'"
					;
			System.out.println(sql);
			
			int count =  stmt.executeUpdate(sql);
			if(count > 0)
				System.out.println(count+"갯수만큼 업데이트");
			else
				System.out.println("업데이트 할게 없습니다.");
			
			// 결과 조회
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
