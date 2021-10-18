package co.micol.prj.theater;

import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.command.GB;
import co.micol.prj.command.MovieMgr;
import co.micol.prj.command.MovieVO;

public class MovieUpdate implements Command {
	MovieMgr movieService = new MovieMgrImpl();
	private Scanner sc = new Scanner(System.in);

	@Override
	public void execute() {
		MovieVO vo = new MovieVO();
		System.out.println("******************");
		System.out.println("영화 제목을 입력하세요.");
		vo.setTitle(sc.nextLine());
		System.out.println("수정할 감독을 입력하세요.");
		vo.setDirector(sc.nextLine());
		System.out.println("바꿀 영화 등급을 입력하세요.");
		vo.setGrade(GB.scb.nextInt());
		System.out.println("수정할 장르를 입력하세요.");
		vo.setGenre(sc.nextLine());
		System.out.println("수정할 내용을 입력하세요");
		vo.setSummary(sc.nextLine());
		int n = movieService.movieUpdate(vo);
		if (n != 0) {
			System.out.println("정상적으로 정보가 변경되었습니다.");
		} else {
			System.out.println("정보가 변경되지 않았습니다.");
		}
	}
}
