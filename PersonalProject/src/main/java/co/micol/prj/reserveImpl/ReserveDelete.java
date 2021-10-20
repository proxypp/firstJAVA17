package co.micol.prj.reserveImpl;

import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.reserve.ReserveService;
import co.micol.prj.reserve.ReserveVO;

public class ReserveDelete implements Command {
	ReserveService reserveService = new ReserveServiceImpl();
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void execute() {
		ReserveVO vo = new ReserveVO();
		System.out.println("==============");
		System.out.println("삭제할 시간을 입력하세요.");
		vo.setTime(sc.nextLine());
		int n = reserveService.reserveDelete(vo);
		if (n != 0) {
			System.out.println("정상적으로 삭제 되었습니다.");
		} else {
			System.out.println("게시글 삭제 실패입니다.");
		}
		
	}

}
