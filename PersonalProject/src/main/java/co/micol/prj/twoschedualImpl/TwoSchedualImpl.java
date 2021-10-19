package co.micol.prj.twoschedualImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.command.DataSource;
import co.micol.prj.schedual.SchedualVO;

import co.micol.prj.schedual.TheaterTwoMapper;
import co.micol.prj.schedual.TheaterTwoService;

public class TwoSchedualImpl implements TheaterTwoService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private TheaterTwoMapper map = sqlSession.getMapper(TheaterTwoMapper.class);
	@Override
	public List<SchedualVO> theaterTwoList() {
		// TODO Auto-generated method stub
		return map.theaterTwoList();
	}

	@Override
	public SchedualVO theaterTwoSelect(SchedualVO vo) {
		// TODO Auto-generated method stub
		return map.theaterTwoSelect(vo);
	}

	@Override
	public int theaterTwoInsert(SchedualVO vo) {
		// TODO Auto-generated method stub
		return map.theaterTwoInsert(vo);
	}

	@Override
	public int theaterTwoUpdate(SchedualVO vo) {
		// TODO Auto-generated method stub
		return map.theaterTwoUpdate(vo);
	}

	@Override
	public int theaterTwoDelete(SchedualVO vo) {
		// TODO Auto-generated method stub
		return map.theaterTwoDelete(vo);
	}

}
