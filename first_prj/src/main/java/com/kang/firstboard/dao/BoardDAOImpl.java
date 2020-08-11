package com.kang.firstboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kang.firstboard.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession sqlSession;

	@Override
	public List<BoardVO> listAll() throws Exception {
		return sqlSession.selectList("mapperlist.listAll");
	}

	@Override
	public void insert(BoardVO boardVO) throws Exception {
		sqlSession.insert("mapperlist.insert_data",boardVO);
	}

	@Override
	public BoardVO read(int bno) throws Exception {
		return sqlSession.selectOne("mapperlist.read",bno);
	}

	@Override
	public void update(BoardVO boardVO) throws Exception {
		sqlSession.update("mapperlist.update_data",boardVO);
	}

	@Override
	public void delete(int bno) throws Exception {
		sqlSession.delete("mapperlist.delete_data",bno);
	}
	
	

	
}
