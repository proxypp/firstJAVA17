package co.micol.prj.reserve;

import java.util.List;

public interface ReserveThirdService {
	List<ReserveVO> reserveThirdList();
	ReserveVO reserveThirdSelect(ReserveVO vo);
	int reserveThirdInsert(ReserveVO vo);
	int reserveThirdUpdate(ReserveVO vo);
	int reserveThirdDelete(ReserveVO vo);
}
