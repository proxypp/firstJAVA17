package co.micol.prj.reserve;

import java.util.List;


public interface ReserveMapper {
	List<ReserveVO> reserveList();
	ReserveVO reserveSelect(ReserveVO vo);
	int reserveInsert(ReserveVO vo);
	int reserveUpdate(ReserveVO vo);
	int reserveDelete(ReserveVO vo);
}
