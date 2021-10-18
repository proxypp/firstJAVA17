package co.micol.prj.command;

import java.util.List;

public interface MovieMapper {
	List<MovieVO> movieList();
	MovieVO movieSelect(MovieVO vo);
	int movieInsert(MovieVO vo);
	int movieUpdate(MovieVO vo);
	int movieDelete(MovieVO vo);
	
}
