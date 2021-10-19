package co.micol.prj.twoschedualImpl;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.command.Command;
import co.micol.prj.schedual.SchedualVO;
import co.micol.prj.schedual.TheaterTwoService;

public class TwoSchedualList implements Command {
	TheaterTwoService theaterTwoService = new TwoSchedualImpl();

	@Override
	public void execute() {
		List<SchedualVO> vo = new ArrayList<SchedualVO>();
		vo = theaterTwoService.theaterTwoList();
		System.out.println();
		System.out.println("****2 상영관 목록 표******");
		for (SchedualVO VO : vo) {
			VO.toListString();
		}
		System.out.println("*****2.상영관 목록 끝*******");
	}
}
