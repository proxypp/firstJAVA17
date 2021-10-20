package co.micol.prj.reserveImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.command.DataSource;
import co.micol.prj.reserve.ReserveMapper;
import co.micol.prj.reserve.ReserveService;
import co.micol.prj.reserve.ReserveVO;

public class ReserveServiceImpl implements ReserveService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private ReserveMapper map = sqlSession.getMapper(ReserveMapper.class);

	@Override
	public List<ReserveVO> reserveList() {
		// TODO Auto-generated method stub
		return map.reserveList();
	}

	@Override
	public ReserveVO reserveSelect(ReserveVO vo) {
		// TODO Auto-generated method stub
		return map.reserveSelect(vo);
	}

	@Override
	public int reserveInsert(ReserveVO vo) {
		// TODO Auto-generated method stub
		return map.reserveInsert(vo);
	}

	@Override
	public int reserveUpdate(ReserveVO vo) {
		// TODO Auto-generated method stub
		return map.reserveUpdate(vo);
	}

	@Override
	public int reserveDelete(ReserveVO vo) {
		// TODO Auto-generated method stub
		return map.reserveDelete(vo);
	}
	
}
