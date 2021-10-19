package co.micol.prj.thirdschedualImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.command.DataSource;
import co.micol.prj.schedual.SchedualVO;
import co.micol.prj.schedual.TheaterThirdMapper;
import co.micol.prj.schedual.TheaterThirdService;

public class ThirdSchedualImpl implements TheaterThirdService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private TheaterThirdMapper map = sqlSession.getMapper(TheaterThirdMapper.class);

	@Override
	public List<SchedualVO> theaterThirdList() {
		// TODO Auto-generated method stub
		return map.theaterThirdList();
	}

	@Override
	public SchedualVO theaterThirdSelect(SchedualVO vo) {
		// TODO Auto-generated method stub
		return map.theaterThirdSelect(vo);
	}

	@Override
	public int theaterThirdInsert(SchedualVO vo) {
		// TODO Auto-generated method stub
		return map.theaterThirdInsert(vo);
	}

	@Override
	public int theaterThirdUpdate(SchedualVO vo) {
		// TODO Auto-generated method stub
		return map.theaterThirdUpdate(vo);
	}

	@Override
	public int theaterThirdDelete(SchedualVO vo) {
		// TODO Auto-generated method stub
		return map.theaterThirdDelete(vo);
	}

}
