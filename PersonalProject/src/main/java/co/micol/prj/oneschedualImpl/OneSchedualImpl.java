package co.micol.prj.oneschedualImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.command.DataSource;

import co.micol.prj.schedual.SchedualVO;
import co.micol.prj.schedual.TheaterMapper;
import co.micol.prj.schedual.TheaterService;

public class OneSchedualImpl implements TheaterService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private TheaterMapper map = sqlSession.getMapper(TheaterMapper.class);

	@Override
	public List<SchedualVO> theaterList() {
		// TODO Auto-generated method stub
		return map.theaterList();
	}

	@Override
	public SchedualVO theaterSelect(SchedualVO vo) {
		// TODO Auto-generated method stub
		return map.theaterSelect(vo);
	}

	@Override
	public int theaterInsert(SchedualVO vo) {
		// TODO Auto-generated method stub
		return map.theaterInsert(vo);
	}

	@Override
	public int theaterUpdate(SchedualVO vo) {
		// TODO Auto-generated method stub
		return map.theaterUpdate(vo);
	}

	@Override
	public int theaterDelete(SchedualVO vo) {
		// TODO Auto-generated method stub
		return map.theaterDelete(vo);
	}
	
}
