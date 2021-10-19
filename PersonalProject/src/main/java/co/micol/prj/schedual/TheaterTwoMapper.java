package co.micol.prj.schedual;

import java.util.List;

public interface TheaterTwoMapper {
	List<SchedualVO> theaterTwoList();
	SchedualVO theaterTwoSelect(SchedualVO vo);
	int theaterTwoInsert(SchedualVO vo);
	int theaterTwoUpdate(SchedualVO vo);
	int theaterTwoDelete(SchedualVO vo);
	
}
