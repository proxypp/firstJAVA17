package co.micol.prj.memberImpl;

import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.member.MemberService;
import co.micol.prj.member.MemberVO;



public class MemberInsert implements Command {
	private Scanner scb = new Scanner(System.in);
	MemberService memberService = new MemberServiceImpl();
	@Override
	public void execute() {

		MemberVO vo = new MemberVO();
		System.out.println("======================");
		System.out.println("아이디를 입력하세요? \n");
		vo.setId(scb.nextLine());
		System.out.println("이름을 입력하세요? \n");
		vo.setName(scb.nextLine());
		System.out.println("패스워드를 입력하세요? \n");
		vo.setPassword(scb.nextLine());
		System.out.println("전화번호를 입력하세요? \n");
		vo.setTel(scb.nextLine());
		System.out.println("포인트를 입력하세요");
		vo.setPoint(scb.nextLine());
		int n = memberService.memberInsert(vo);
		if (n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		} else {
			System.out.println("등록이 실패되었습니다.");
		}
	}

}
