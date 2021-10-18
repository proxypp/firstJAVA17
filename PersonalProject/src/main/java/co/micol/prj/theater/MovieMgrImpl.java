package co.micol.prj.theater;

import java.util.List;

import org.apache.ibatis.session.SqlSession;


import co.micol.prj.command.DataSource;
import co.micol.prj.command.MovieMapper;
import co.micol.prj.command.MovieMgr;
import co.micol.prj.command.MovieVO;

public class MovieMgrImpl implements MovieMgr {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MovieMapper map = sqlSession.getMapper(MovieMapper.class);

	@Override
	public List<MovieVO> movieList() {
		
		return map.movieList();
	}

	@Override
	public MovieVO movieSelect(MovieVO vo) {
		// TODO Auto-generated method stub
		return map.movieSelect(vo);
	}

	@Override
	public int movieInsert(MovieVO vo) {
		// TODO Auto-generated method stub
		return map.movieInsert(vo);
	}

	@Override
	public int movieDelete(MovieVO vo) {
		// TODO Auto-generated method stub
		return map.movieDelete(vo);
	}


	@Override
	public int movieUpdate(MovieVO vo) {
		// TODO Auto-generated method stub
		return map.movieUpdate(vo);
	}
	
}
