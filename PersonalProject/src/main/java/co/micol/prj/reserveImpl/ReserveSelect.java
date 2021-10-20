package co.micol.prj.reserveImpl;

import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.reserve.ReserveService;
import co.micol.prj.reserve.ReserveVO;

public class ReserveSelect implements Command {
	ReserveService reserveService = new ReserveServiceImpl();
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void execute() {
		ReserveVO vo = new ReserveVO();
		System.out.println("***********************");
		System.out.println("조회할 시간을 선택하세요.");
		
		vo.setTime(sc.nextLine());
		vo = reserveService.reserveSelect(vo);
		if(vo != null) {
			vo.toString();
		}
		System.out.println("***********************");
		
		
		
	}

}
