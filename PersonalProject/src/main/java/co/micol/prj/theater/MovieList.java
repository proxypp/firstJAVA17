package co.micol.prj.theater;

import java.util.ArrayList;
import java.util.List;

import co.micol.prj.command.Command;
import co.micol.prj.command.MovieMgr;
import co.micol.prj.command.MovieVO;

public class MovieList implements Command {
	MovieMgr movieService = new MovieMgrImpl();
	@Override
	public void execute() {
		List<MovieVO> movies = new ArrayList<MovieVO>();
		movies = movieService.movieList();
		System.out.println();
		System.out.println("**** 영화 목록 표 *****");
		for (MovieVO movie : movies) {
			movie.toListString();
		}
		System.out.println("***** 영화 목록 끝 ******");
	}
}
