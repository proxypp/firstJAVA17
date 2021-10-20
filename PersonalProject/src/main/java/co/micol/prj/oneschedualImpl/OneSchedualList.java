package co.micol.prj.oneschedualImpl;


import java.util.ArrayList;
import java.util.List;

import co.micol.prj.command.Command;
import co.micol.prj.schedual.SchedualVO;
import co.micol.prj.schedual.TheaterService;

public class OneSchedualList implements Command{
	TheaterService theaterService;

	@Override
	public void execute() {
		List<SchedualVO> vo = new ArrayList<SchedualVO>();
		theaterService = new OneSchedualImpl();
		vo = theaterService.theaterList();
		System.out.println();
		System.out.println("****1 상영관 목록 표******");
		for (SchedualVO VO : vo) {
			VO.toListString();
		}
		System.out.println("*****1.상영관 목록 끝*******");
		
	}
}
