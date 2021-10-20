package co.micol.prj.memberImpl;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.command.Command;
import co.micol.prj.command.GB;
import co.micol.prj.member.MemberService;
import co.micol.prj.member.MemberVO;

public class MemberList implements Command {
	MemberService memberService;
	@Override
	public void execute() {
		if (GB.AUTHOR.equals("ADMIN")) {
			List<MemberVO> vo = new ArrayList<MemberVO>();
			memberService = new MemberServiceImpl();
			vo = memberService.memberSelectList();
			System.out.println("****VIP는 1년동안 서로 다른 영화 20편을 봐야 승급됩니다.");
			System.out.println("***VVIP는 1년동안 서로 다른 영화 50편을 봐야 승급됩니다.");
			if (vo != null) {
				for (MemberVO member : vo) {
					member.toListString();
				}
			} else {
				System.out.println("등록된 회원이 없습니다.");
			}
		} else {
			System.out.println("ADMIN 계정으로 접속해야 사용할 수 있습니다.");
		}
	}
}

