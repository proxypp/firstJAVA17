package co.micol.prj.reserveTwoImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.command.DataSource;
import co.micol.prj.reserve.ReserveTwoMapper;
import co.micol.prj.reserve.ReserveTwoService;
import co.micol.prj.reserve.ReserveVO;

public class ReserveTwoImpl implements ReserveTwoService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private ReserveTwoMapper map = sqlSession.getMapper(ReserveTwoMapper.class);

	@Override
	public List<ReserveVO> reserveTwoList() {
		// TODO Auto-generated method stub
		return map.reserveTwoList();
	}

	@Override
	public ReserveVO reserveTwoSelect(ReserveVO vo) {
		// TODO Auto-generated method stub
		return map.reserveTwoSelect(vo);
	}

	@Override
	public int reserveTwoInsert(ReserveVO vo) {
		// TODO Auto-generated method stub
		return map.reserveTwoInsert(vo);
	}

	@Override
	public int reserveTwoUpdate(ReserveVO vo) {
		// TODO Auto-generated method stub
		return map.reserveTwoUpdate(vo);
	}

	@Override
	public int reserveTwoDelete(ReserveVO vo) {
		// TODO Auto-generated method stub
		return map.reserveTwoDelete(vo);
	}

}
