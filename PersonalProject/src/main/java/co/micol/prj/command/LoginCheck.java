package co.micol.prj.command;

import java.util.Scanner;


public class LoginCheck {
	private Scanner sc = new Scanner(System.in);
	public void run() {
		AdminService admin = new AdminServiceImpl();
		AdminVO vo;
		boolean b = false;
		do {
			vo = new AdminVO();
			System.out.println("===== 로그인 해주세요. ======");
			System.out.println("아이디를 입력하세요.");
			vo.setId(sc.nextLine());
			System.out.println("패스워드를 입력하세요.");
			vo.setPassword(sc.nextLine());
			vo = admin.adminSelect(vo);
			if (vo != null) {
				GB.NAME = vo.getName();
				GB.AUTHOR = vo.getAuthor();
				b = true;
			} else {
				System.out.println("패스워드가 틀렸습니다.");
				}
			}while (!b);
	}	
}
