package co.micol.prj.reserveThirdImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;


import co.micol.prj.command.DataSource;
import co.micol.prj.reserve.ReserveThirdMapper;
import co.micol.prj.reserve.ReserveThirdService;
import co.micol.prj.reserve.ReserveVO;

public class ReserveThirdServiceImpl implements ReserveThirdService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private ReserveThirdMapper map = sqlSession.getMapper(ReserveThirdMapper.class);

	@Override
	public List<ReserveVO> reserveThirdList() {
		// TODO Auto-generated method stub
		return map.reserveThirdList();
	}

	@Override
	public ReserveVO reserveThirdSelect(ReserveVO vo) {
		// TODO Auto-generated method stub
		return map.reserveThirdSelect(vo);
	}

	@Override
	public int reserveThirdInsert(ReserveVO vo) {
		// TODO Auto-generated method stub
		return map.reserveThirdInsert(vo);
	}

	@Override
	public int reserveThirdUpdate(ReserveVO vo) {
		// TODO Auto-generated method stub
		return map.reserveThirdUpdate(vo);
	}

	@Override
	public int reserveThirdDelete(ReserveVO vo) {
		// TODO Auto-generated method stub
		return map.reserveThirdDelete(vo);
	}
	
}
