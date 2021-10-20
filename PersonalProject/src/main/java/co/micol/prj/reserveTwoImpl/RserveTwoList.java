package co.micol.prj.reserveTwoImpl;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.command.Command;
import co.micol.prj.reserve.ReserveTwoService;
import co.micol.prj.reserve.ReserveVO;



public class RserveTwoList implements Command {
	ReserveTwoService reserveTwoService;
	@Override
	public void execute() {
		List<ReserveVO> vo = new ArrayList<ReserveVO>();
		reserveTwoService = new ReserveTwoImpl();
		vo = reserveTwoService.reserveTwoList();
		
		if (vo != null) {
			for (ReserveVO reserve : vo) {
				reserve.toListString();
			}
		} else {
			System.out.println("등록된 회원이 없습니다.");
		}
	}

}
