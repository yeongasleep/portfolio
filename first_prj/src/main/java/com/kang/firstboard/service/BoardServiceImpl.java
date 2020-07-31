package com.kang.firstboard.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kang.firstboard.dao.BoardDAO;
import com.kang.firstboard.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO boardDAO;

	@Override
	public List<BoardVO> listAll() throws Exception {
		return boardDAO.listAll();
	}

	@Override
	public void insert(BoardVO boardVO) throws Exception {
		boardDAO.insert(boardVO);
	}

	@Override
	public BoardVO read(int bno) throws Exception {
		return boardDAO.read(bno);
	}

	@Override
	public void update(BoardVO boardVO) throws Exception {
		boardDAO.update(boardVO);
	}

	
	

}
