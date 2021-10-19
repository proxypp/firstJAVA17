package co.micol.prj.command;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminVO {
	private String id;
	private String name;
	private String password;
	private String tel;
	private String address;
	private String author;

	public String toString() {  //개별보기
		System.out.println("아이디 : " + id);
		System.out.println("이  름 : " + name);
		System.out.println("패스워드 : " + password );
		System.out.println("전화번호 : " + tel);
		System.out.println("주  소 : " + address);
		System.out.println("권  한 : " + author);		
		return null;
	}
	
}
