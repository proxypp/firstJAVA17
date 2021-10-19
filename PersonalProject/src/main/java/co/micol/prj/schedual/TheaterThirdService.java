package co.micol.prj.schedual;

import java.util.List;

public interface TheaterThirdService {
	List<SchedualVO> theaterThirdList();
	SchedualVO theaterThirdSelect(SchedualVO vo);
	int theaterThirdInsert(SchedualVO vo);
	int theaterThirdUpdate(SchedualVO vo);
	int theaterThirdDelete(SchedualVO vo);
}
