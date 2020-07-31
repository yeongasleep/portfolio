package com.kang.firstboard.service;

import java.util.List;

import com.kang.firstboard.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> listAll() throws Exception;
	public void insert(BoardVO boardVO) throws Exception;
	public BoardVO read(int bno) throws Exception;
	public void update(BoardVO boardVO) throws Exception;
}
