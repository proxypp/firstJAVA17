package co.micol.prj.theater;

import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.command.MovieMgr;
import co.micol.prj.command.MovieVO;

public class MovieDelete implements Command {
	MovieMgr movieService = new MovieMgrImpl();
	private Scanner sc = new Scanner(System.in);
	@Override
	public void execute() {
		MovieVO vo = new MovieVO();
		System.out.println("*****************");
		System.out.println("삭제할 영화를 입력하세요.");
		vo.setTitle(sc.nextLine());
		int n = movieService.movieDelete(vo);
		if (n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		}else {
			System.out.println("삭제되지 않았습니다.");
		}
		
	}

}
