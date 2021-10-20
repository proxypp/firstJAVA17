package co.micol.prj.memberImpl;

import java.util.Scanner;

import co.micol.prj.command.GB;
import co.micol.prj.member.MemberService;
import co.micol.prj.member.MemberVO;
import co.micol.prj.memberImpl.MemberServiceImpl;

public class LoginCheck {
	private Scanner scb = new Scanner(System.in);
	public void run() {
		MemberVO vo;
		boolean b = false;
		
		do {
			MemberService memberService = new MemberServiceImpl();
			vo = new MemberVO();
			System.out.println("!@#$%^&*()_+ 영화관 관리 프로그램 입니다.+_)(*&^%$#@!");
			System.out.println(">>>>>>>>>> 상영관 관리자 로그인 해주세요. <<<<<<<<<<<<");
			System.out.println("상영관 관리자 아이디를 입력하세요.");
			System.out.print("-->>");
			vo.setId(scb.nextLine());
			System.out.println("상영관 관리자 패스워드를 입력하세요.");
			System.out.print("-->>");
			vo.setPassword(scb.nextLine());
			vo = memberService.memberSelect(vo);
			
			if (vo != null) {
				GB.NAME = vo.getName();
				GB.AUTHOR = vo.getAuthor();
				if (GB.AUTHOR.equals("ADMIN")) {					
					b = true;
			}else {
				System.out.println(">>관리자 권한이 없습니다.<<");
			}
			} else {
				System.out.println(">>패스워드가 틀렸습니다.<<");
			}
		}while (!b);
		}
	}

