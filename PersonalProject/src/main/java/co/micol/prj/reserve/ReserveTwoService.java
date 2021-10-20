package co.micol.prj.reserve;

import java.util.List;

public interface ReserveTwoService {
	List<ReserveVO> reserveTwoList();
	ReserveVO reserveTwoSelect(ReserveVO vo);
	int reserveTwoInsert(ReserveVO vo);
	int reserveTwoUpdate(ReserveVO vo);
	int reserveTwoDelete(ReserveVO vo);
}
