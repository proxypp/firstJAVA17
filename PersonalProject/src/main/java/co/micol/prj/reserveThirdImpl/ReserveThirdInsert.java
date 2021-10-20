package co.micol.prj.reserveThirdImpl;

import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.reserve.ReserveThirdService;
import co.micol.prj.reserve.ReserveVO;

public class ReserveThirdInsert implements Command {
	ReserveThirdService reserveService = new ReserveThirdServiceImpl();
	private Scanner sc = new Scanner(System.in);

	@Override
	public void execute() {
		ReserveVO vo = new ReserveVO();
		System.out.println("** 자리 예약 등록 페이지입니다. **");
		System.out.println("영화제목을 입력하세요..");
		vo.setTitle(sc.nextLine());
		System.out.println("영화시간을 입력하세요..");
		vo.setTime(sc.nextLine());
		System.out.println("    좌       석     ");
		System.out.println("A1  A2  A3  A4  A5  A6  A7  A8  A9  A10");
		System.out.println("1번 좌석 이용을 등록하세요. 자리가 있으면O 없으면 x");
		vo.setSeat1(sc.nextLine());
		System.out.println("2번 좌석 이용을 등록하세요. 자리가 있으면O 없으면 x");
		vo.setSeat2(sc.nextLine());
		System.out.println("3번 좌석 이용을 등록하세요. 자리가 있으면O 없으면 x");
		vo.setSeat3(sc.nextLine());
		System.out.println("4번 좌석 이용을 등록하세요. 자리가 있으면O 없으면 x");
		vo.setSeat4(sc.nextLine());
		System.out.println("5번 좌석 이용을 등록하세요. 자리가 있으면O 없으면 x");
		vo.setSeat5(sc.nextLine());
		System.out.println("6번 좌석 이용을 등록하세요. 자리가 있으면O 없으면 x");
		vo.setSeat6(sc.nextLine());
		System.out.println("7번 좌석 이용을 등록하세요. 자리가 있으면O 없으면 x");
		vo.setSeat7(sc.nextLine());
		System.out.println("8번 좌석 이용을 등록하세요. 자리가 있으면O 없으면 x");
		vo.setSeat8(sc.nextLine());
		System.out.println("9번 좌석 이용을 등록하세요. 자리가 있으면O 없으면 x");
		vo.setSeat9(sc.nextLine());
		System.out.println("10번 좌석 이용을 등록하세요. 자리가 있으면O 없으면 x");
		vo.setSeat10(sc.nextLine());
		int n = reserveService.reserveThirdInsert(vo);

		if (n != 0) {
			System.out.println("정상적으로 변경이 되었습니다.");
		} else {
			System.out.println("글 수정이 실패 되었습니다.");
		}

	}

}
