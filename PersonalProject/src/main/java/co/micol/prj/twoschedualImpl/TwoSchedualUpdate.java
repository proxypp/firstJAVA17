package co.micol.prj.twoschedualImpl;

import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.command.GB;
import co.micol.prj.schedual.SchedualVO;
import co.micol.prj.schedual.TheaterTwoService;

public class TwoSchedualUpdate implements Command {
	TheaterTwoService theaterTwoService = new TwoSchedualImpl();
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void execute() {
		SchedualVO vo = new SchedualVO();
		System.out.println("*******************");
		System.out.println("수정할 영화의 시간을 선택하세요.***");
		System.out.println("1. 09:30 2.12:00 3.14:30 4.17:00 5.19:30 6.22:00 7.24:30");
		vo.setTime(sc.nextLine());
		System.out.println("영화 제목을 입력하세요. \n");
		vo.setTitle(sc.nextLine());
		System.out.println("영화 등급을 입력하세요.***");
		vo.setGrade(GB.scb.nextInt());
		System.out.println("영화 장르를 입력하세요.***");
		vo.setGenre(sc.nextLine());
		System.out.println("영화 내용을 입력하세요.***");
		vo.setSummary(sc.nextLine());
		int n = theaterTwoService.theaterTwoUpdate(vo);
		if (n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		} else {
			System.out.println("등록이 실패 되었습니다.ㄴ");
		}

	}

}
