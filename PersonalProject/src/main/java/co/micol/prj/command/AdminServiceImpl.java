package co.micol.prj.command;

import org.apache.ibatis.session.SqlSession;


public class AdminServiceImpl implements AdminService{
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private AdminMapper map = sqlSession.getMapper(AdminMapper.class);
	
	@Override
	public AdminVO adminSelect(AdminVO vo) {
		// TODO Auto-generated method stub
		return map.adminSelect(vo);
	}

}
