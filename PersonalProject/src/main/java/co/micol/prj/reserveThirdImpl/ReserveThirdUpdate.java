package co.micol.prj.reserveThirdImpl;

import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.reserve.ReserveThirdService;
import co.micol.prj.reserve.ReserveVO;

public class ReserveThirdUpdate implements Command {
	ReserveThirdService reserveService = new ReserveThirdServiceImpl();
	private Scanner sc = new Scanner(System.in);
	@Override
	public void execute() {
		ReserveVO vo = new ReserveVO();
		System.out.println("영화타이틀을 수정하세요.");
		vo.setTitle(sc.nextLine());
		System.out.println("영화 시간을 수정하세요.");
		vo.setTime(sc.nextLine());
		System.out.println("    좌       석     ");
		System.out.println("A1  A2  A3  A4  A5  A6  A7  A8  A9  A10");
		System.out.println("1번좌석 이용을 수정하세요. 예약 완료는O 예약 취소는 X");
		vo.setSeat1(sc.nextLine());
		System.out.println("2번좌석 이용을 수정하세요. 예약 완료는O 예약 취소는 X");
		vo.setSeat2(sc.nextLine());
		System.out.println("3번좌석 이용을 수정하세요. 예약 완료는O 예약 취소는 X");
		vo.setSeat3(sc.nextLine());
		System.out.println("4번좌석 이용을 수정하세요. 예약 완료는O 예약 취소는 X");
		vo.setSeat4(sc.nextLine());
		System.out.println("5번좌석 이용을 수정하세요. 예약 완료는O 예약 취소는 X");
		vo.setSeat5(sc.nextLine());
		System.out.println("6번좌석 이용을 수정하세요. 예약 완료는O 예약 취소는 X");
		vo.setSeat6(sc.nextLine());
		System.out.println("7번좌석 이용을 수정하세요. 예약 완료는O 예약 취소는 X");
		vo.setSeat7(sc.nextLine());
		System.out.println("8번좌석 이용을 수정하세요. 예약 완료는O 예약 취소는 X");
		vo.setSeat8(sc.nextLine());
		System.out.println("9번좌석 이용을 수정하세요. 예약 완료는O 예약 취소는 X");
		vo.setSeat9(sc.nextLine());
		System.out.println("10번좌석 이용을 수정하세요. 예약 완료는O 예약 취소는 X");
		vo.setSeat10(sc.nextLine());
		int n = reserveService.reserveThirdUpdate(vo);
		if (n != 0) {
			System.out.println("정상적으로 변경이 되었습니다.");
		} else {
			System.out.println("글 수정이 실패 되었습니다.");
		}

	}

}
