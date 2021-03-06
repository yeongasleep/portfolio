package com.kang.firstboard.dao;

import java.util.List;

import com.kang.firstboard.vo.BoardVO;

public interface BoardDAO {
	public List<BoardVO> listAll() throws Exception;
	public void insert(BoardVO boardVO) throws Exception;
	public BoardVO read(int bno) throws Exception;
	public void update(BoardVO boardVO) throws Exception;
	public void delete(int bno) throws Exception;
}
