package co.micol.prj.reserveImpl;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.command.Command;
import co.micol.prj.reserve.ReserveService;
import co.micol.prj.reserve.ReserveVO;

public class ReserveList implements Command {
	ReserveService reserveService;
	@Override
	public void execute() {
		List<ReserveVO> vo = new ArrayList<ReserveVO>();
		reserveService = new ReserveServiceImpl();
		vo = reserveService.reserveList();
		
		if (vo != null) {
			for (ReserveVO reserve : vo) {
				reserve.toListString();
			}
		} else {
			System.out.println("등록된 회원이 없습니다.");
		}
	}

}
