package co.micol.prj.reserveThirdImpl;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.command.Command;
import co.micol.prj.reserve.ReserveThirdService;
import co.micol.prj.reserve.ReserveVO;

public class ReserveThirdList implements Command {
	ReserveThirdService reserveTwoService;
	@Override
	public void execute() {
		List<ReserveVO> vo = new ArrayList<ReserveVO>();
		reserveTwoService = new ReserveThirdServiceImpl();
		vo = reserveTwoService.reserveThirdList();
		
		if (vo != null) {
			for (ReserveVO reserve : vo) {
				reserve.toListString();
			}
		} else {
			System.out.println("등록된 회원이 없습니다.");
		}
	}

}

