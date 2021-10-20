package co.micol.prj.theater;

import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.command.GB;
import co.micol.prj.command.MovieMgr;
import co.micol.prj.command.MovieVO;

public class MovieInsert implements Command {
	MovieMgr movieService = new MovieMgrImpl();
	private Scanner sc = new Scanner(System.in);
	@Override
	public void execute() {
		MovieVO vo = new MovieVO();
		System.out.println("*******************");
		System.out.println("영화 제목을 입력하세요. \n");
		vo.setTitle(sc.nextLine());
		System.out.println("영화 감독을 입력하세요.***");
		vo.setDirector(sc.nextLine());
		System.out.println("영화 등급을 입력하세요.***");
		vo.setGrade(GB.scb.nextInt());
		System.out.println("영화 장르를 입력하세요.***");
		vo.setGenre(sc.nextLine());
		System.out.println("영화 내용을 입력하세요.***");
		vo.setSummary(sc.nextLine());
		System.out.println("상영관을 입력해주세요.");
		vo.setTheater(sc.nextLine());
		int n = movieService.movieInsert(vo);
		if (n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		}else {
			System.out.println("등록이 실패 되었습니다.ㄴ");
		}	
	}
}
