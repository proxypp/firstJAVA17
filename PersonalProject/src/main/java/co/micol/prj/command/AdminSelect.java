package co.micol.prj.command;

import java.util.Scanner;



public class AdminSelect implements Command {
	AdminService Admin = new AdminServiceImpl();
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		AdminVO members = new AdminVO();
		System.out.println("==================");
		System.out.println("조회할 아이디를 입력하세요.");
		members.setId(scb.nextLine());
		members = Admin.adminSelect(members);
		
	}
	
}
