package co.micol.prj.schedual;

import java.util.List;

public interface TheaterService {
	List<SchedualVO> theaterList();
	SchedualVO theaterSelect(SchedualVO vo);
	int theaterInsert(SchedualVO vo);
	int theaterUpdate(SchedualVO vo);
	int theaterDelete(SchedualVO vo);
	
}
