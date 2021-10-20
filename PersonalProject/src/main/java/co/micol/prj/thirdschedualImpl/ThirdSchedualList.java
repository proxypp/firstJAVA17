package co.micol.prj.thirdschedualImpl;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.command.Command;
import co.micol.prj.schedual.SchedualVO;
import co.micol.prj.schedual.TheaterThirdService;


public class ThirdSchedualList implements Command {
	
	TheaterThirdService theaterService;
	@Override
	public void execute() {
		List<SchedualVO> vo = new ArrayList<SchedualVO>();
		theaterService = new ThirdSchedualImpl();
		vo = theaterService.theaterThirdList();
		System.out.println();
		System.out.println("****3 상영관 목록 표******");
		for (SchedualVO VO : vo) {
			VO.toListString();
		}
		System.out.println("*****3.상영관 목록 끝*******");
		
	}
	
}
