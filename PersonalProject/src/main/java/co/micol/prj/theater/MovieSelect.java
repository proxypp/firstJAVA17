package co.micol.prj.theater;

import java.util.Scanner;

import co.micol.prj.command.Command;
import co.micol.prj.command.MovieMgr;
import co.micol.prj.command.MovieVO;

public class MovieSelect implements Command {
	MovieMgr movieService = new MovieMgrImpl();
	private Scanner sc = new Scanner(System.in);
	@Override
	public void execute() {
		MovieVO movie = new MovieVO();
		System.out.println("************************");
		System.out.println("**** 조회할 영화를 입력하세요***");
		movie.setTitle(sc.nextLine());
		movie = movieService.movieSelect(movie);
		
		if (movie != null) {
			movie.toString();
		}
		System.out.println("**********************");
	}
}
