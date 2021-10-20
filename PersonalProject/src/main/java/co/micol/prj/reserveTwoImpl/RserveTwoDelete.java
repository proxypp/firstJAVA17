package co.micol.prj.reserveTwoImpl;

import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.reserve.ReserveTwoService;
import co.micol.prj.reserve.ReserveVO;

public class RserveTwoDelete implements Command {
	ReserveTwoService reserveService = new ReserveTwoImpl();
	private Scanner sc = new Scanner(System.in);
	@Override
	public void execute() {
		ReserveVO vo = new ReserveVO();
		System.out.println("==============");
		System.out.println("삭제할 시간을 입력하세요.");
		vo.setTime(sc.nextLine());
		int n = reserveService.reserveTwoDelete(vo);
		if (n != 0) {
			System.out.println("정상적으로 삭제 되었습니다.");
		} else {
			System.out.println("게시글 삭제 실패입니다.");
		}

	}

}
