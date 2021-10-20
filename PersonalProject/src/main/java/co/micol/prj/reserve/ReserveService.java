package co.micol.prj.reserve;

import java.util.List;

import co.micol.prj.command.MovieVO;

public interface ReserveService {
	List<ReserveVO> reserveList();
	ReserveVO reserveSelect(ReserveVO vo);
	int reserveInsert(ReserveVO vo);
	int reserveUpdate(ReserveVO vo);
	int reserveDelete(ReserveVO vo);
	
}
