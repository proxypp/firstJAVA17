package co.micol.prj.memberImpl;

import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.member.MemberService;
import co.micol.prj.member.MemberVO;



public class MemberSelect implements Command {
	private Scanner scb = new Scanner(System.in);
	MemberService memberService = new MemberServiceImpl();
	
	@Override
	public void execute() {
		MemberVO members = new MemberVO();
		System.out.println("==================");
		System.out.println("조회할 아이디를 입력하세요.");
		members.setId(scb.nextLine());
		members = memberService.memberSelect(members);
		
		System.out.print(members.getId() + " : ");
		System.out.print(members.getName() + " : ");
		System.out.print(members.getPassword() + " : ");
		System.out.print(members.getTel() + " : ");
		System.out.print(members.getPoint() + " : ");
		System.out.println(members.getAuthor());

	}
	
}
