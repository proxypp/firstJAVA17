package co.micol.prj.thirdschedualImpl;


import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.schedual.SchedualVO;
import co.micol.prj.schedual.TheaterThirdService;

public class ThirdSchedualSelect implements Command{
	TheaterThirdService theaterService = new ThirdSchedualImpl();
	private Scanner sc = new Scanner(System.in);
	@Override
	public void execute() {
		SchedualVO vo = new SchedualVO();
		System.out.println("************************");
		System.out.println("**** 조회할 영화시간를 입력하세요***");
		System.out.println("1. 09:30 2.12:00 3.14:30 4.17:00 5.19:30 6.22:00 7.24:30");
		vo.setTime(sc.nextLine());
		vo = theaterService.theaterThirdSelect(vo);
		if (vo != null) {
			vo.toString();
		}
		System.out.println("**********************");
		
	}
}
