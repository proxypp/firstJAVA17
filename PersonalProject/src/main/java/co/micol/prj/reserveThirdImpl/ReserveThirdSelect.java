package co.micol.prj.reserveThirdImpl;

import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.reserve.ReserveThirdService;
import co.micol.prj.reserve.ReserveVO;

public class ReserveThirdSelect implements Command {
	ReserveThirdService reserveService = new ReserveThirdServiceImpl();
	private Scanner sc = new Scanner(System.in);
	@Override
	public void execute() {
		ReserveVO vo = new ReserveVO();
		System.out.println("***********************");
		System.out.println("조회할 시간을 선택하세요.");
		
		vo.setTime(sc.nextLine());
		vo = reserveService.reserveThirdSelect(vo);
		if(vo != null) {
			vo.toString();
		}
		System.out.println("***********************");

	}

}
