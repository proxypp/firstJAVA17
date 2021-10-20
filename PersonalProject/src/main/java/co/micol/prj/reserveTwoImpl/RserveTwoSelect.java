package co.micol.prj.reserveTwoImpl;

import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.reserve.ReserveTwoService;
import co.micol.prj.reserve.ReserveVO;


public class RserveTwoSelect implements Command {
	ReserveTwoService reserveService = new ReserveTwoImpl();
	private Scanner sc = new Scanner(System.in);
	@Override
	public void execute() {
		ReserveVO vo = new ReserveVO();
		System.out.println("***********************");
		System.out.println("조회할 시간을 선택하세요.");
		
		vo.setTime(sc.nextLine());
		vo = reserveService.reserveTwoSelect(vo);
		if(vo != null) {
			vo.toString();
		}
		System.out.println("***********************");
		
	}

}
